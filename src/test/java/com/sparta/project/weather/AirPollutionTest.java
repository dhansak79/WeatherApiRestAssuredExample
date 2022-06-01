package com.sparta.project.weather;

import com.sparta.project.weather.controller.PropertiesController;
import com.sparta.weather.model.AirPollution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;
import com.sparta.project.weather.model.airpollutionmodels.AirPollution;

public class AirPollutionTest {

  @Test
  public void checkAirPollution() {
    String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50&lon=50&appid="
            + PropertiesController.getApiKey();
    AirPollution responseBody = get( url ).as( AirPollution.class );
    System.out.println( responseBody );
//    "list[0].main", hasValue( 1 )
//    get( url ).then().assertThat(). .body( "list[0].main", hasValue( 2 ));
    Assertions.assertTrue( responseBody.getList().get( 0 ).getMain().getAqi() > 0 && responseBody.getList().get( 0 ).getMain().getAqi() <= 5 );
  }

}


