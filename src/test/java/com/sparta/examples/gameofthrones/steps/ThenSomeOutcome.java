package com.sparta.examples.gameofthrones.steps;

import com.sparta.examples.gameofthrones.model.Book;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenSomeOutcome {

  @ExpectedScenarioState
  private Book[] books;

  public void thereAre$OfThem( int expectedNumberOfBooks ) {
    assertThat( books.length ).isEqualTo( expectedNumberOfBooks );
  }
}
