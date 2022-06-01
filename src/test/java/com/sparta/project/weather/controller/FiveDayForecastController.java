package com.sparta.project.weather.controller;

import com.sparta.project.weather.model.fivedayforecast.FiveDayForecast;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class FiveDayForecastController {


  public FiveDayForecast getData(String lat, String lon) {
    String url = "http://api.openweathermap.org/data/2.5/forecast?lat=" + lat + "&lon=" + lon + "&appid="
            + PropertiesController.getApiKey();

    FiveDayForecast fiveDayForecast = get( url ).as( FiveDayForecast.class );

    return fiveDayForecast;
  }
}
