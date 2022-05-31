package com.sparta.examples.kanye;

import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class KanyeRest {

  @Test
  public void whatWouldKanyeSay() {
    ResponseBody responseBody = when().get( "https://api.kanye.rest" );
    System.out.println( responseBody.asPrettyString() );
  }

}
