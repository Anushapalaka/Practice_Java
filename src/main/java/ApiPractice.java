import io.restassured.RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ApiPractice {
    static String baseURl="https://fakeapi.in";
    public static void main(String[] args) {
        String completeUrl = baseURl+ "/api/photos";
//        given().when().get(completeUrl).then().statusCode(200).log().all();

//        given().when().body().post(completeUrl).then().statusCode(200).log().all();

    }
}
