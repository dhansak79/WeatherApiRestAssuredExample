package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.weather.model.AirPollution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class AirPollutionTest {

  @Test
  public void checkAirPollution() {
    //TODO switch to using params
    String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50&lon=50&appid="
            + PropertiesController.getApiKey();
    AirPollution airPollution = get( url ).as( AirPollution.class );
    Assertions.assertEquals( 2, airPollution.getList().get(0).getMain().getAqi());
  }


}


