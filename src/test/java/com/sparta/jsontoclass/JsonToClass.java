package com.sparta.jsontoclass;

import static com.sparta.weather.ExampleTest.GEO_SVC;
import static io.restassured.RestAssured.given;

import com.sparta.project.weather.controller.PropertiesController;
import com.sun.codemodel.JCodeModel;
import io.restassured.response.ResponseBody;
import java.io.File;
import java.io.IOException;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;
import org.junit.jupiter.api.Test;

public class JsonToClass {

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
            .params( "appid", PropertiesController.getApiKey())
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
