package com.sparta.project.weather.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesController {

  public static String getApiKey() {
    String apiKey;
    try {
      Properties properties = new Properties();
      properties.load( new FileReader( "src/test/resources/weatherapi.properties" ) );
      apiKey = properties.getProperty( "apikey" );
    } catch ( IOException e ) {
      // attempt to get from env property
      apiKey = System.getenv( "weatherapikey" );
      if ( apiKey == null ) {
        e.printStackTrace();
      }
    }
    return apiKey;
  }
}
