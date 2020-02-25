package com.example.weatherapp.repository;


import com.example.weatherapp.model.MyWeather;
import com.example.weatherapp.model.WeatherResponse;
import com.example.weatherapp.repository.local.LocalDataSource;
import com.example.weatherapp.repository.remote.RemoteDataSource;

import java.util.Arrays;

import io.reactivex.Observable;

public class Repository {

    private RemoteDataSource api = RemoteDataSource.getInstance();
    private LocalDataSource db = new LocalDataSource();

    private Repository() {}

    private static class RepositoryInstanceHolder {
        private static final Repository INSTANCE = new Repository();
    }

    public static Repository getInstance() {
        return RepositoryInstanceHolder.INSTANCE;
    }

    public Observable<WeatherResponse> getWeather(String latitude, String longitude) {
       return api.getWeatherService().getWeather(
                "ee8f59b30c6cfb9f1789dcd865943e89",
                latitude,
                longitude,
               Arrays.asList("minutely", "alert", "flags")
        );
    }

    //for db
    public void saveWeather(MyWeather weather) {
    }
}
