package com.sparta.project.weather.controller;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.project.weather.model.City;
import io.restassured.response.ResponseBody;
import java.util.List;

public class GeoData {

  public static List<City> getDataForCity(String cityName) {
    String url = "http://api.openweathermap.org/geo/1.0/direct";

    ResponseBody responseBody = given()
        .params("q", cityName)
        .params("limit", 5)
        .params("appid", PropertiesController.getApiKey())
        .when()
        .get(url)
        .getBody();

    ObjectMapper objectMapper = new ObjectMapper().configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );

    try {
      return objectMapper.readValue( responseBody.asString(), new TypeReference<>() {
      } );
    } catch ( JsonProcessingException e ) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}
