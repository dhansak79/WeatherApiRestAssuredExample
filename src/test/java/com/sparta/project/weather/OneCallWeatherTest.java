package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.project.weather.model.onecallmodels.OneCall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class OneCallWeatherTest {


  @Test
  public void checkTimezone() {
    String url = "https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&exclude=hourly,daily&appid="
            + PropertiesController.getApiKey();
    OneCall oneCall = get( url ).as( OneCall.class );

    Assertions.assertEquals( "America/Chicago", oneCall.getTimezone() );
  }

}
