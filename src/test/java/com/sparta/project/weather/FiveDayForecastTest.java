package com.sparta.project.weather;

import com.sparta.project.weather.controller.FiveDayForecastController;
import com.sparta.project.weather.model.fivedayforecast.FiveDayForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FiveDayForecastTest {

  @Test
  public void CheckFiveDayForecast() {

    FiveDayForecastController fiveDayForecastController = new FiveDayForecastController();
    FiveDayForecast fiveDayForecast = fiveDayForecastController.getData();
    Assertions.assertEquals( "Shuzenji", fiveDayForecast.getCity().getName() );
  }
}
