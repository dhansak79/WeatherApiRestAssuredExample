package com.sparta.examples.gameofthrones.steps;

import com.sparta.examples.gameofthrones.model.Book;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

import static io.restassured.RestAssured.when;

public class WhenSomeAction {
  @ProvidedScenarioState
  private Book[] books;

  public void iAskForAListOfBooksInTheGameOfThronesSeries() {
    books = when().get( "/books" ).getBody().as( Book[].class );
  }
}
