package com.sparta.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExampleTest {

  private static String apiKey;

  @BeforeAll
  static void getProperties() {
    try {
      Properties properties = new Properties();
      properties.load( new FileReader( "src/test/resources/weatherapi.properties" ) );
      apiKey = properties.getProperty( "apikey" );
    } catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }

  @Test
  public void exampleTest() {
    System.out.println( apiKey );
    Assertions.assertTrue( true );
  }

}
