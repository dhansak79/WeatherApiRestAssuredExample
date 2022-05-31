package com.sparta.jsontoclass;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsonToClassFactory {
  public static void getModelClasses(String urlString, String packageName, String javaClassName) {
    try {
      File outputJavaClassDirectory = new File( "src/test/java/" );
      String fullPackageName = "com.sparta.project.weather.model." + packageName;
      URL url = new URL( urlString );
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
      mapper.generate(jcodeModel, javaClassName, fullPackageName, url );

      jcodeModel.build(outputJavaClassDirectory);

    } catch ( IOException ex ) {
      throw new RuntimeException( ex );
    }
  }

}
