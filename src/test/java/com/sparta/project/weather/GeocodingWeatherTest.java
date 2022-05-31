package com.sparta.project.weather;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.project.weather.model.City;
import io.restassured.response.ResponseBody;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeocodingWeatherTest {

  private static String apiKey;

  @BeforeAll
  static void getProperties() {
    try {
      Properties properties = new Properties();
      properties.load(new FileReader("src/test/resources/weatherapi.properties"));
      apiKey = properties.getProperty("apikey");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // http://api.openweathermap.org/geo/1.0/direct?q=London&limit=5&appid=4d9db150b01a213183b30cc5448027dd

  @ParameterizedTest
  @CsvSource(value = {
      "London",
      "London,GB",
      "London,OH,US"
  })
  public void getGeocodeForCity(String city) {
    String url = "http://api.openweathermap.org/geo/1.0/direct";

    var response = given()
        .params("q", city)
        .params("limit", 5)
        .params("appid", apiKey)
        .when()
        .get(url);

    ResponseBody responseBody = response.getBody();

    Assertions.assertEquals(200, response.getStatusCode());
  }

  private static List<City> getCitiesFromObjectMapper(ObjectMapper objectMapper, ResponseBody responseBody) {
    try {
      return objectMapper.readValue( responseBody.asString(), new TypeReference<>() {
      } );
    } catch ( JsonProcessingException e ) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}
