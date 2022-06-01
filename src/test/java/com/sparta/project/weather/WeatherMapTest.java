package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;

public class WeatherMapTest {

  @Test
  public void getResponseBody(){
    String url = "https://tile.openweathermap.org/map/clouds_new/5/20/23.png?appid=" +
            PropertiesController.getApiKey();

    int statusCode = get(url).statusCode();

    Assertions.assertEquals( 200, statusCode );
  }

  @Test
  public void getResponseType(){
    String url = "https://tile.openweathermap.org/map/clouds_new/5/20/23.png?appid=" +
            PropertiesController.getApiKey();

    String statusCode = get(url).contentType();
    Assertions.assertEquals( "image/png", statusCode );
  }
}
