package com.sparta.jsontoclass;

import com.sparta.project.weather.controller.PropertiesController;

import org.junit.jupiter.api.Test;

public class JsonToClass {
  @Test
  void getClassMap() {
    String urlString = "https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&exclude=hourly,daily&appid=" +
            PropertiesController.getApiKey();
    String className = "City1";
    String packageName = "acitymodelexample";

    JsonToClassFactory.getModelClasses( urlString, packageName, className );
  }
}
