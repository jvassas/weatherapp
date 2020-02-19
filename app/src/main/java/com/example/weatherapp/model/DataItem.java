package com.example.weatherapp.model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("precipProbability")
	private double precipProbability;

	@SerializedName("precipIntensity")
	private double precipIntensity;

	@SerializedName("precipIntensityError")
	private double precipIntensityError;

	@SerializedName("precipType")
	private String precipType;

	@SerializedName("time")
	private int time;

	public void setPrecipProbability(double precipProbability){
		this.precipProbability = precipProbability;
	}

	public double getPrecipProbability(){
		return precipProbability;
	}

	public void setPrecipIntensity(double precipIntensity){
		this.precipIntensity = precipIntensity;
	}

	public double getPrecipIntensity(){
		return precipIntensity;
	}

	public void setPrecipIntensityError(double precipIntensityError){
		this.precipIntensityError = precipIntensityError;
	}

	public double getPrecipIntensityError(){
		return precipIntensityError;
	}

	public void setPrecipType(String precipType){
		this.precipType = precipType;
	}

	public String getPrecipType(){
		return precipType;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"precipProbability = '" + precipProbability + '\'' + 
			",precipIntensity = '" + precipIntensity + '\'' + 
			",precipIntensityError = '" + precipIntensityError + '\'' + 
			",precipType = '" + precipType + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}