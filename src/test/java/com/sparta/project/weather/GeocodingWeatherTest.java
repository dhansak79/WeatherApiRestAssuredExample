package com.sparta.project.weather;

import com.sparta.project.weather.controller.GeoData;
import com.sparta.project.weather.model.City;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeocodingWeatherTest {

  @Test
  public void getGeoDataForCity() {
    List<City> cities = GeoData.getDataForCity("London");

    Assertions.assertEquals("GB", cities.get(0).getCountry());
  }
}
