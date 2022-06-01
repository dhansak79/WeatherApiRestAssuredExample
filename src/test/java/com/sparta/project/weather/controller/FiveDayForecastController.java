package com.sparta.project.weather.controller;

import com.sparta.project.weather.model.fivedayforecast.FiveDayForecast;

import static io.restassured.RestAssured.get;

public class FiveDayForecastController {


  public FiveDayForecast getData() {
    String url = "http://api.openweathermap.org/data/2.5/forecast?lat=35&lon=139&appid="
            + PropertiesController.getApiKey();
    FiveDayForecast fiveDayForecast = get( url ).as( FiveDayForecast.class );

    return fiveDayForecast;
  }
}
