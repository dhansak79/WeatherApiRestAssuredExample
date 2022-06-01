package com.sparta.project.weather;
import com.sparta.project.weather.model.fivedayforecast.FiveDayForecast;
import com.sparta.project.weather.controller.PropertiesController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;

public class FiveDayForecastTest {

  @Test
  public void CheckFiveDayForecast(){
    String url = "http://api.openweathermap.org/data/2.5/forecast?lat=35&lon=139&appid="
            + PropertiesController.getApiKey();
    FiveDayForecast fiveDayForecast = get(url).as(FiveDayForecast.class);
    Assertions.assertEquals( 1654025498,fiveDayForecast.getCity().getSunrise() );


  }









}
