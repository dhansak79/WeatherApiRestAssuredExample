package com.sparta.examples.gameofthrones;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.examples.gameofthrones.model.Book;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;

public class GameOfThronesExampleTest {


  @BeforeAll
  public static void setup() {
    RestAssured.baseURI = "https://anapioficeandfire.com/api/";
  }

  @Test
  public void getAllBooksTest() throws JsonProcessingException {
    Book[] books = when().get( "/books" ).getBody().as( Book[].class );

    assertThat( books ).extracting( "name" )
            .containsExactlyInAnyOrder(
                    "A Game of Thrones",
                    "A Clash of Kings",
                    "A Storm of Swords",
                    "The Hedge Knight",
                    "A Feast for Crows",
                    "The Sworn Sword",
                    "The Mystery Knight",
                    "A Dance with Dragons",
                    "The Princess and the Queen",
                    "The Rogue Prince" )
            .doesNotContain(
                    "The Fellowship of the Ring" );
  }
}
