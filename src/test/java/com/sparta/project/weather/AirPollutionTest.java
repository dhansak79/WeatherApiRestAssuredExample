package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.weather.model.AirPollution;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.hamcrest.object.HasEqualValues;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AirPollutionTest {

  @Test
  public void checkAirPolution() {
    String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50&lon=50&appid="
            + PropertiesController.getApiKey();
    AirPollution responseBody = get( url ).as( AirPollution.class );
    System.out.println( responseBody );
//    "list[0].main", hasValue( 1 )
//    get( url ).then().assertThat(). .body( "list[0].main", hasValue( 2 ));
    Assertions.assertTrue( responseBody.getList().get( 0 ).getMain().getAqi() > 0 && responseBody.getList().get( 0 ).getMain().getAqi() <= 5 );
  }

}


