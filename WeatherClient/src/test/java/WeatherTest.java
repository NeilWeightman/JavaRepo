import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.weather.client.entities.OpenWeather;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class WeatherTest {
    @Test
    public void getBirminghamWeather(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            OpenWeather weather = mapper.readValue(
                    new URL("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK&appid=9bfba80c31ae00e08c7ae93fd5075d52"),
                    OpenWeather.class);
            Assertions.assertEquals("Birmingham", weather.getName());
            Assertions.assertEquals(weather.getCoord().getLat(), 52.4814, 0.001);
            Assertions.assertTrue(weather.getClouds().getAll() >= 75);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getBirminghamHttpClientVersion(){
        HttpRequest req =
                HttpRequest
                        .newBuilder()
                        .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK&appid=9bfba80c31ae00e08c7ae93fd5075d52"))
                        .POST(HttpRequest.BodyPublishers.ofString(""))
                        .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> resp = null;
        try {
            resp = client.send(req,
                    HttpResponse.BodyHandlers.ofString());
            Assertions.assertEquals(resp.statusCode(), 200);
            HttpHeaders headers = resp.headers();
            String contentType = headers.firstValue("content-type").get();
            Assertions.assertEquals(contentType, "application/json; charset=utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String json = resp.body();
        ObjectMapper mapper = new ObjectMapper();
        try {
            OpenWeather weather = mapper.readValue(json, OpenWeather.class);
            Assertions.assertEquals("Birmingham", weather.getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
