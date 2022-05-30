package com.sparta.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.weather.model.City;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class ExampleTest {

  public static final String OPEN_WEATHER_URL = "http://api.openweathermap.org/";
  public static final String WEATHER_SVC = OPEN_WEATHER_URL + "data/2.5/weather";
  public static final String GEO_SVC = OPEN_WEATHER_URL + "geo/1.0/direct";
  private static String apiKey;

  @BeforeAll
  static void getProperties() {
    try {
      Properties properties = new Properties();
      properties.load( new FileReader( "src/test/resources/weathmusicerapi.properties" ) );
      apiKey = properties.getProperty( "apikey" );
    } catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }

  @ParameterizedTest
  @CsvSource( value = {
          "35:139:JP", //Can't remember
          "51.5072:0.1276:GB", //London
          "37.7749:122.4194:US" //San Francisco
  }, delimiter = ':' )
  public void correctCountryReturnedForLatitudeAndLongitudeTest( String latitude, String longitude, String expectedCountry ) {
    ResponseBody responseBody = getWeatherForCity( latitude );
    //TODO no assertions
    System.out.println( responseBody.asPrettyString() );
  }

  @ParameterizedTest
  @CsvSource( value = {
          "London:51.5073219:-0.1276474",
          "Edinburgh:55.9533456:-3.1883749" }, delimiter = ':' )
  public void getCoordinatesForCityTest( String cityName, String latitude, String longitude ) {
    List< City > cities = getCityGeoData( cityName );
    City city = cities.get( 0 );
    Assertions.assertEquals( latitude, city.getLatitude() );
    Assertions.assertEquals( longitude, city.getLongitude() );
  }

  private ResponseBody getWeatherForCity( String cityName ) {
    List< City > cities = getCityGeoData( cityName );
    return getWeatherForCity( cities.get( 0 ) );
  }

  private ResponseBody getWeatherForCity( City city ) {
    return given()
            .params( "lat", city.getLatitude() )
            .params( "lon", city.getLongitude() )
            .params( "appid", apiKey )
            .when()
            .get( WEATHER_SVC )
            .getBody();
  }

  private List< City > getCityGeoData( String cityName ) {
    ResponseBody responseBody = given()
            .params( "q", cityName )
            .params( "appid", apiKey )
            .when()
            .get( GEO_SVC )
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
