package com.sparta.project.weather;

import com.sparta.project.weather.controller.OneCallController;
import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.project.weather.model.onecallmodels.OneCall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class OneCallWeatherTest {


  @Test
  public void checkTimezone() {
    OneCallController oneCallController = new OneCallController();
    OneCall oneCall = oneCallController.getData();
    Assertions.assertEquals( "America/Chicago", oneCall.getTimezone() );
  }

}
