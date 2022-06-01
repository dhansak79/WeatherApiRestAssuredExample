package com.sparta.project.weather;

import com.sparta.project.weather.controller.CurrentWeatherController;
import com.sparta.project.weather.model.currentweather.CurrentWeather;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CurrentWeatherTest {

  @Test
  void currentWeatherTest() {
    CurrentWeatherController currentWeatherController = new CurrentWeatherController();
    CurrentWeather currentWeather = currentWeatherController.getData();
    Assertions.assertEquals( "stations", currentWeather.getBase() );
  }
}
