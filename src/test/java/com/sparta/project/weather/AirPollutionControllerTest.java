package com.sparta.project.weather;

import com.sparta.project.weather.controller.AirPollutionController;
import com.sparta.project.weather.controller.ApiData;
import com.sparta.project.weather.model.airpollutionmodels.AirPollution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AirPollutionControllerTest {

  @Test
  public void checkAirPollution() {
    ApiData airPollutionController = new AirPollutionController();
    AirPollution responseBody = ( AirPollution ) airPollutionController.getData();

    Assertions.assertTrue( responseBody.getList().get( 0 ).getMain().getAqi() > 0 && responseBody.getList().get( 0 ).getMain().getAqi() <= 5 );
  }

}


