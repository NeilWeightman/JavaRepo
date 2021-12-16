package com.sparta.weather.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord{

	@JsonProperty("lon")
	private Double lon;

	@JsonProperty("lat")
	private Double lat;

	public void setLon(Double lon){
		this.lon = lon;
	}

	public Double getLon(){
		return lon;
	}

	public void setLat(Double lat){
		this.lat = lat;
	}

	public Double getLat(){
		return lat;
	}
}