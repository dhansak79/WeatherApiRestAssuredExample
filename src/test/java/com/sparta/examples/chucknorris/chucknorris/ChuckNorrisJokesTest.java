package com.sparta.examples.chucknorris.chucknorris;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChuckNorrisJokesTest {

  @Test
  public void categoriesOfJokes() {
    String[] categories = null;
    ResponseBody responseBody = when().get( "https://api.chucknorris.io/jokes/categories" );
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      categories = objectMapper.readValue( responseBody.asString(), String[].class );
    } catch ( JsonProcessingException e ) {
      e.printStackTrace();
    }
    assertThat( categories ).containsExactlyInAnyOrder(
            "animal",
            "career",
            "celebrity",
            "dev",
            "explicit",
            "fashion",
            "food",
            "history",
            "money",
            "movie",
            "music",
            "political",
            "religion",
            "science",
            "sport",
            "travel" );
  }

}
