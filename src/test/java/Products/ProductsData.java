package Products;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ProductsData {

    static String baseURL = "https://fakeapi.in";

    public static void getProductData() {
        String completeUrl = baseURL + "/api/products";
        Response response = given().when().get(completeUrl);
        response.then().statusCode(200).log().all();

        Assert.assertEquals(response.getStatusCode(), 200, "invalid code");
        Assert.assertEquals(response.jsonPath().getInt("users[0].id"),1, "data not match");
        Assert.assertEquals(response.jsonPath().getString("users[0].name"),"Meghan Grady","Name not amtch");

    }

    public static void getUserWithId(){
        String completeUrl = baseURL + "/api/products/10";
        given().when().get(completeUrl).then().statusCode(200).log().all();

    }
    public static void getUserWithPhone(){
        String completeUrl = baseURL+ "/api/products?q=phone";
        given().when().get(completeUrl).then().statusCode(200).log().all();
    }

    public static void filterWithBooks(){

        String completeUrl = baseURL+"/api/products?category=Books";
        given().when().get(completeUrl).then().statusCode(200).log().all();

    }
    public static void getMinimumValue(int minPrice){
        String completeUrl = baseURL + "/api/ecommerce/products";
        given().when().queryParam("minPrice", minPrice).get(completeUrl).then().statusCode(200).log().all();

    }

    public static void deleteData(){

        String completeUrl= baseURL + "/api/ecommerce/products/1";
        given().when().delete(completeUrl).then().statusCode(200).log().all();
    }

    public static void getByStatus(){

        String complereUrl = baseURL + "/api/ecommerce/products?status=active&type=premium";
         given().when().queryParam("status", "active").queryParam("type", "premium").get(complereUrl).then().statusCode(200).log().all();


    }
    public static void main(String[] args) {
//        getProductData();
//        getUserWithId();
//        getUserWithPhone();
//        filterWithBooks();
//            getMinimumValue(500);
//        deleteData();
        getByStatus();
    }
}
