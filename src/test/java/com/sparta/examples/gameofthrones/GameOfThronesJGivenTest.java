package com.sparta.examples.gameofthrones;

import com.sparta.examples.gameofthrones.steps.GivenSomeState;
import com.sparta.examples.gameofthrones.steps.ThenSomeOutcome;
import com.sparta.examples.gameofthrones.steps.WhenSomeAction;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;


public class GameOfThronesJGivenTest extends ScenarioTest< GivenSomeState, WhenSomeAction, ThenSomeOutcome > {

  @Test
  public void whatBooksAreInTheGameOfThronesSeriesTest() {
    given().thereAreBooks();
    when().iAskForAListOfBooksInTheGameOfThronesSeries();
    then().thereAre$OfThem( 10 );
  }

}
