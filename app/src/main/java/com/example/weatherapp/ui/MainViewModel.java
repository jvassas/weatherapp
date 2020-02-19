package com.example.weatherapp.ui;

import androidx.lifecycle.ViewModel;

import com.example.weatherapp.model.MyWeather;
import com.example.weatherapp.model.WeatherResponse;
import com.example.weatherapp.repository.Repository;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainViewModel extends ViewModel {

    private Repository repo = Repository.getInstance();

    public void getWeather(String latitude, String longitude) {
        repo.getWeather(latitude, longitude)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WeatherResponse weatherResponse) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
