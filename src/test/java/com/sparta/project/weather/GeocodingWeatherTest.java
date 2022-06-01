package com.sparta.project.weather;

import com.sparta.project.weather.controller.ApiData;
import com.sparta.project.weather.controller.GeoData;
import com.sparta.project.weather.model.City;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeocodingWeatherTest {

  @Test
  public void getGeoDataForCity() {
    ApiData geoData = new GeoData();
    List< City > cities = geoData.getData( "London" );

    Assertions.assertEquals( "GB", cities.get( 0 ).getCountry() );
  }
}
