package com.sparta.weather.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.weather.client.entities.OpenWeather;

import java.io.IOException;
import java.net.URL;

public class WeatherClient {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            OpenWeather weather = mapper.readValue(
                    new URL("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK&appid=9bfba80c31ae00e08c7ae93fd5075d52"),
                    OpenWeather.class);
            System.out.println(weather.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
