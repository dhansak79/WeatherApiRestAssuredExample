package com.sparta.tronald;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class DonaldTrumpTest {

  @Test
  public void whatDoYouThinkAbout() {
    RestAssured.baseURI = "https://api.tronalddump.io";
    ResponseBody responseBody = when().get( "/random/quote" ).getBody();
    System.out.println( responseBody.asPrettyString() );
  }

}
