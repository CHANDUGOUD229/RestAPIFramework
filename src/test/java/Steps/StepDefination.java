package Steps;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import pojo.AddPlaceRequest;
import pojo.Location;
import resource.APIResources;
import testData.TestDataBuild;
import utils.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StepDefination extends Utils {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    Response response;
    TestDataBuild data = new TestDataBuild();
    static String place_id;
    JsonPath js;


    @Given("Add Place Payload {string} {string} {string}")
    public void add_place_payload(String name, String lang, String address) throws IOException {

        requestSpec = given().spec(requestSpecification())
                .body(data.addPlacePayload(name, lang, address));
    }

//    @When("user calls {string} with Post Http Request")
//    public void user_calls_with_post_http_request(String resource) {
//
//        APIResources resources = APIResources.valueOf(resource);
//        response = requestSpec.when()
//                .post(resources.getResource())
//                .then()
//                .spec(responseSpecification())
//                .extract().response();
//
//    }

    @When("user calls {string} with {string} Http Request")
    public void user_calls_with_http_request(String resource, String method) {
        APIResources resources = APIResources.valueOf(resource);
        if (method.equalsIgnoreCase("POST")) {
            response = requestSpec.when()
                    .post(resources.getResource());
        } else if (method.equalsIgnoreCase("GET")) {
            response = requestSpec.when()
                    .get(resources.getResource());

        } else if (method.equalsIgnoreCase("DELETE")) {
            response = requestSpec.when()
                    .delete(resources.getResource());
        }
    }

    @Then("the API call success with status code {int}")
    public void the_api_call_success_with_status_code(Integer statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode, "Status code not matching");

    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String exStatus) {
        Assert.assertEquals(getJsonPath(response, key), exStatus, "Status is not matching ");
    }


    @Then("verify place_Id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String name, String resource) throws IOException {
        APIResources resources = APIResources.valueOf(resource);
        place_id = getJsonPath(response, "place_id");
        requestSpec = given()
                .spec(requestSpecification())
                .queryParam("place_id", place_id);
        user_calls_with_http_request(resource, "GET");
        String actualName = getJsonPath(response, "name");
        Assert.assertEquals(actualName, name, "both names are not  matching.");
    }


    @Given("Delete place payload")
    public void delete_place_payload() throws IOException {
        requestSpec = given()
                .spec(requestSpecification())
                .body(data.deletePlaceAPIPayload(place_id));


    }

}
