package com.sparta.weather.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main{

	@JsonProperty("temp")
	private Double temp;

	@JsonProperty("temp_min")
	private Double tempMin;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("pressure")
	private Integer pressure;

	@JsonProperty("feels_like")
	private Double feelsLike;

	@JsonProperty("temp_max")
	private Double tempMax;

	public void setTemp(Double temp){
		this.temp = temp;
	}

	public Double getTemp(){
		return temp;
	}

	public void setTempMin(Double tempMin){
		this.tempMin = tempMin;
	}

	public Double getTempMin(){
		return tempMin;
	}

	public void setHumidity(Integer humidity){
		this.humidity = humidity;
	}

	public Integer getHumidity(){
		return humidity;
	}

	public void setPressure(Integer pressure){
		this.pressure = pressure;
	}

	public Integer getPressure(){
		return pressure;
	}

	public void setFeelsLike(Double feelsLike){
		this.feelsLike = feelsLike;
	}

	public Double getFeelsLike(){
		return feelsLike;
	}

	public void setTempMax(Double tempMax){
		this.tempMax = tempMax;
	}

	public Double getTempMax(){
		return tempMax;
	}
}