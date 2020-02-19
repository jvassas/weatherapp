package com.example.weatherapp.repository.remote;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "https://api.darksky.net";

    private RetrofitInstance() {
    }

    private static class RepositoryInstanceHolder {
        private static final Retrofit INSTANCE = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static Retrofit getInstance() { return RepositoryInstanceHolder.INSTANCE;}



}
