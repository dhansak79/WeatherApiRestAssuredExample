package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.project.weather.model.currentweather.CurrentWeather;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;

public class CurrentWeatherTest {

  @Test
  void currentWeatherTest() {
    String url = "https://api.openweathermap.org/data/2.5/weather?lat=0&lon=130&appid=" + PropertiesController.getApiKey();

    CurrentWeather currentWeather = get(url).as(CurrentWeather.class);

    Assertions.assertEquals("04n", currentWeather.getWeather().get(0).getIcon());
  }
}
