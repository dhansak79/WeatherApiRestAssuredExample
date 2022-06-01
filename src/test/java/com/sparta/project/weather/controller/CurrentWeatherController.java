package com.sparta.project.weather.controller;

import com.sparta.project.weather.model.currentweather.CurrentWeather;

import java.util.List;

import static io.restassured.RestAssured.get;

public class CurrentWeatherController implements ApiData{
  public CurrentWeather getData() {
    String url = "https://api.openweathermap.org/data/2.5/weather?lat=0&lon=130&appid=" + PropertiesController.getApiKey();

    CurrentWeather currentWeather = get( url ).as( CurrentWeather.class );

    return currentWeather;
  }

  @Override
  public List getData( String s ) {
    return null;
  }
}
