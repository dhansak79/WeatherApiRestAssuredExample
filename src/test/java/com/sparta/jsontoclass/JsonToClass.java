package com.sparta.jsontoclass;

import com.sun.codemodel.JCodeModel;
import io.restassured.response.ResponseBody;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import static com.sparta.weather.ExampleTest.GEO_SVC;
import static io.restassured.RestAssured.given;

public class JsonToClass {


  private static String apiKey;

  @BeforeAll
  static void getProperties() {
    try {
      Properties properties = new Properties();
      properties.load( new FileReader( "src/test/resources/weatherapi.properties" ) );
      apiKey = properties.getProperty( "apikey" );
    } catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }

  public static void convertJsonToJavaClass( String jsonString, String javaClassName)
          throws IOException {
    File outputJavaClassDirectory = new File( "src/test/java/" );
    String packageName = "com.sparta.weather.model";
    JCodeModel jcodeModel = new JCodeModel();

    GenerationConfig config = new DefaultGenerationConfig() {
      @Override
      public boolean isGenerateBuilders() {
        return true;
      }

      @Override
      public SourceType getSourceType() {
        return SourceType.JSON;
      }
    };

    SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
    mapper.generate(jcodeModel, javaClassName, packageName, jsonString );

    jcodeModel.build(outputJavaClassDirectory);
  }

  @Test
  void getClassMap(){
    ResponseBody responseBody = given()
            .params( "q", "London" )
            .params( "appid", apiKey )
            .when()
            .get( GEO_SVC )
            .getBody();

    String jsonString = responseBody.asString();
    String className = "City1";

    try {
      convertJsonToJavaClass( jsonString, className );
    } catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
