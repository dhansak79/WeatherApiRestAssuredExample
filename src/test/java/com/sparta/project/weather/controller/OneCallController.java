package com.sparta.project.weather.controller;

import com.sparta.project.weather.model.onecallmodels.OneCall;

import static io.restassured.RestAssured.get;

public class OneCallController {

  public OneCall getData() {
    String url = "https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&exclude=hourly,daily&appid="
            + PropertiesController.getApiKey();
    OneCall oneCall = get( url ).as( OneCall.class );

    return oneCall;
  }
}
