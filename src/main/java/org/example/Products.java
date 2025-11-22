package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Products {
      static String baseURl  ="https://fakeapi.in/";
    public static void getProducts(int id){
        String completeurl = baseURl+"/api/products";
       Response response =  given().when().queryParam("id").get(completeurl);
        response.then().log().all();

//        Assert.assertEquals(response.jsonPath().getInt());

    }
    public static void main(String[] args) {
        getProducts(8);

    }
}
