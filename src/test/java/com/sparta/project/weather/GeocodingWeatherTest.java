package com.sparta.project.weather;

import com.sparta.project.weather.controller.ApiData;
import com.sparta.project.weather.controller.FiveDayForecastController;
import com.sparta.project.weather.controller.GeoData;
import com.sparta.project.weather.model.City;
import java.util.List;
import com.sparta.project.weather.model.fivedayforecast.FiveDayForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeocodingWeatherTest {

  @Test
  public void getGeoDataForCity() {
    ApiData geoData = new GeoData();
    List< City > cities = geoData.getData( "London" );

    Assertions.assertEquals( "GB", cities.get( 0 ).getCountry() );
  }

  @Test
  public void getWeatherForGotCity() {
    ApiData geoData = new GeoData();
    List< City > cities = geoData.getData( "London" );
    City city = cities.get(0);

    Assertions.assertEquals("London", city.getName());

    FiveDayForecast fiveDayForecast = new FiveDayForecastController().getData(
            String.valueOf(city.getLat()), String.valueOf(city.getLon().toString()));

    Assertions.assertEquals("GB", fiveDayForecast.getCity().getCountry());
  }
}
