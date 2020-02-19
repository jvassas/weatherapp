package com.example.weatherapp.repository.remote;

import com.example.weatherapp.model.WeatherResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("/forecast/{key}/{latitude}/{longitude}")
    Observable<WeatherResponse> getWeather(
            @Path("key") String key,
            @Path("latitude") String latitude,
            @Path("longitude") String longitude,
            @Query("exclude")List<String> exclude
            );
}
