package com.sparta.project.weather.controller;

import com.sparta.project.weather.model.airpollutionmodels.AirPollution;

import java.util.List;

import static io.restassured.RestAssured.get;



public class AirPollutionController implements ApiData {


  public AirPollution getData() {
    String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50&lon=50&appid="
            + PropertiesController.getApiKey();
    AirPollution responseBody = get( url ).as( AirPollution.class );

    return responseBody;
  }

  @Override
  public List getData( String s ) {
    return null;
  }
}
