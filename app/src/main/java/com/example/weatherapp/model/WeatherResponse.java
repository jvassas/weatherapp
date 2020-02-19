package com.example.weatherapp.model;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse{

	@SerializedName("currently")
	private Currently currently;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("daily")
	private Daily daily;

	@SerializedName("hourly")
	private Hourly hourly;

	@SerializedName("minutely")
	private Minutely minutely;

	@SerializedName("longitude")
	private double longitude;

	public void setCurrently(Currently currently){
		this.currently = currently;
	}

	public Currently getCurrently(){
		return currently;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setDaily(Daily daily){
		this.daily = daily;
	}

	public Daily getDaily(){
		return daily;
	}

	public void setHourly(Hourly hourly){
		this.hourly = hourly;
	}

	public Hourly getHourly(){
		return hourly;
	}

	public void setMinutely(Minutely minutely){
		this.minutely = minutely;
	}

	public Minutely getMinutely(){
		return minutely;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"WeatherResponse{" + 
			"currently = '" + currently + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",daily = '" + daily + '\'' + 
			",hourly = '" + hourly + '\'' + 
			",minutely = '" + minutely + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}