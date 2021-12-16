package com.sparta.weather.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind{

	@JsonProperty("deg")
	private Integer deg;

	@JsonProperty("speed")
	private Double speed;

	@JsonProperty("gust")
	private Double gust;

	public void setDeg(Integer deg){
		this.deg = deg;
	}

	public Integer getDeg(){
		return deg;
	}

	public void setSpeed(Double speed){
		this.speed = speed;
	}

	public Double getSpeed(){
		return speed;
	}

	public void setGust(Double gust){
		this.gust = gust;
	}

	public Double getGust(){
		return gust;
	}
}