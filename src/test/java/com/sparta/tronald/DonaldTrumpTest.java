package com.sparta.tronald;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DonaldTrumpTest {

  @Test
  public void whatDoYouThinkAbout() {
    String query = "Obama";
    RestAssured.baseURI = "https://api.tronalddump.io";
    ResponseBody responseBody = given().queryParam( "query", query )
            .when().get( "/search/quote/" ).getBody();
    System.out.println( responseBody.asPrettyString() );
  }

}
