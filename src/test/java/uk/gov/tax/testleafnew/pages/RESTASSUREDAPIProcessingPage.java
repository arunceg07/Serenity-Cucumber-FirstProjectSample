package uk.gov.tax.testleafnew.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class RESTASSUREDAPIProcessingPage {

    public void regResinGetRequest() {

        Response Response = RestAssured.get("https://reqres.in/api/users/2");
//        Response Response = RestAssured.get("https://www.google.com/");

        ResponseBody ResponseBody = Response.body();
        System.out.println("Calendar Confirmation-->"+ResponseBody.prettyPrint());

    }

    public void regResinBDDGetRequest() {
        RestAssured.baseURI = "https://reqres.in/api/";
        ValidatableResponse Response = RestAssured.given().param("","").header("","").when()
                .get("/users/2").then().statusCode(200);
    }

    public void regResinPostRequest() {

    }
}