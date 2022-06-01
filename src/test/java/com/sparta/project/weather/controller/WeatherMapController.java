package com.sparta.project.weather.controller;

import static io.restassured.RestAssured.get;

public class WeatherMapController {

  public String getData() {
    String url = "https://tile.openweathermap.org/map/clouds_new/5/20/23.png?appid=" +
            PropertiesController.getApiKey();

    String statusCode = get( url ).contentType();

    return statusCode;
  }
}
