package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
  static  RequestSpecification requestSpec;
  static ResponseSpecification responseSpec;

    public RequestSpecification requestSpecification() throws IOException {
        if(requestSpec==null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
            requestSpec = new RequestSpecBuilder()
                    .setBaseUri(getGlobalValue("baseURI"))
                    .setContentType(ContentType.JSON)
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .addQueryParam("key", "qaclick123")
                    .build();
            return requestSpec;
        }
        return  requestSpec;
    }

    public ResponseSpecification responseSpecification(){
        responseSpec = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200)
                .build();
        return responseSpec;
    }

    public String getJsonPath(Response response, String key){
        String resp=response.asString();
        JsonPath js=new JsonPath(resp);
       return js.get(key).toString();
    }



    public static String getGlobalValue(String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream fi=new FileInputStream("src/test/resources/global.properties");
        prop.load(fi);
      return   prop.getProperty(key);

    }



}
