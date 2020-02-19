package com.example.weatherapp.model;

import java.util.List;

public class MyWeather {

    private String cityName;
    private String data;
    private String summary;
    private int currTemp;
    private int highTemp;
    private int lowTemp;
    private List<DataItem> hourlyData;


    public MyWeather(String cityName, String data, String summary, int currTemp, int highTemp, int lowTemp, List<DataItem> hourlyData) {
        this.cityName = cityName;
        this.data = data;
        this.summary = summary;
        this.currTemp = currTemp;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.hourlyData = hourlyData;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getCurrTemp() {
        return currTemp;
    }

    public void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public List<DataItem> getHourlyData() {
        return hourlyData;
    }

    public void setHourlyData(List<DataItem> hourlyData) {
        this.hourlyData = hourlyData;
    }
}
