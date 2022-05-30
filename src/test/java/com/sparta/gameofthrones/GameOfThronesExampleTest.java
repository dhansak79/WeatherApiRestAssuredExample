package com.sparta.gameofthrones;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.gameofthrones.model.Book;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;

public class GameOfThronesExampleTest {

  private static final String BOOKS_SVC = "https://anapioficeandfire.com/api/books";

  @Test
  public void getAllBooksTest() throws JsonProcessingException {
    ResponseBody responseBody = when().get( BOOKS_SVC ).getBody();

    ObjectMapper objectMapper = new ObjectMapper()
            .configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );

    List< Book > gameOfThronesBooks = objectMapper.readValue( responseBody.asString(), new TypeReference<>() {
    } );

    assertThat( gameOfThronesBooks ).extracting( "name" )
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
                    "The Rogue Prince" );
  }
}
