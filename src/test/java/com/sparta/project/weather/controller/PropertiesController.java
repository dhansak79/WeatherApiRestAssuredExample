package com.sparta.project.weather.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesController {
  
  public static String getApiKey() {
    try {
      Properties properties = new Properties();
      properties.load(new FileReader("src/test/resources/weatherapi.properties"));
      return properties.getProperty("apikey");
    } catch (IOException e) {
      System.out.println("Getting property from system properties: " + System.getProperty( "system.weatherapikey" ));
      return System.getProperty( "system.weatherapikey" );
    }
  }
}
