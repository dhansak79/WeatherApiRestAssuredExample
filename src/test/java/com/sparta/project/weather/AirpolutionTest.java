package com.sparta.project.weather;

import com.sparta.jsontoclass.JsonToClass;
import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.project.weather.model.onecallmodels.OneCall;
import com.sparta.weather.model.AirPollution;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class AirpolutionTest {

  @Test
  public void checkAirPolution() {
    String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50&lon=50&appid="
            + PropertiesController.getApiKey();
    AirPollution airPollution = get( url ).as( AirPollution.class );

    Assertions.assertEquals( 2, airPollution.getList().get(0).getMain().getAqi());
  }


}


