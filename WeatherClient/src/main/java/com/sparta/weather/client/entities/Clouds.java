package com.sparta.weather.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds{

	@JsonProperty("all")
	private Integer all;

	public void setAll(Integer all){
		this.all = all;
	}

	public Integer getAll(){
		return all;
	}
}