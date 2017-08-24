package com.mxh.design.demo10;

public class State {
	
	private Weather weather;
	
	public void setWeather(Weather weather){
		this.weather = weather;
	}
	
	public void getWeather(){
		this.weather.showWeather();
	}
}
