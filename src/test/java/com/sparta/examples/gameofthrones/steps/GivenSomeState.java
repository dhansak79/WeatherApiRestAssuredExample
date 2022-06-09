package com.sparta.examples.gameofthrones.steps;

import io.restassured.RestAssured;

public class GivenSomeState {
  public void thereAreBooks() {
    RestAssured.baseURI = "https://anapioficeandfire.com/api/";
  }
}
