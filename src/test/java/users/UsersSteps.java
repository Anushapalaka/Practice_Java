package users;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UsersSteps {

    static String baseURL = "https://fakeapi.in";

    public static void getUsers(){
        String completeUrl = baseURL + "/api/users";
        System.out.println(completeUrl);
        given().when().get(completeUrl).then().statusCode(200);

    }

    public static void getSpecificUser(){
        String completeUrl = baseURL +  "/api/users/4";
        given().when().get(completeUrl).then().statusCode(200).body("name",equalTo("Jo Goodwin")).log().all();
    }

    public static void getUserWithName(String name){
        String completeUrl = baseURL + "/api/users";
        Response response = given().queryParam("name",name).when().get(completeUrl);
        response.then().log().all();

        System.out.println("getUserWithName response code: "+response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200, "Invalid response code found in api get user with name");
        Assert.assertNotNull(response.jsonPath().getInt("users[0].id"), "id value in null in the response");
        Assert.assertEquals(response.jsonPath().getString("users[0].name"),"Todd Johnson","Name doesn't match with the response");
        Assert.assertEquals(response.jsonPath().getString("users[0].email"),"Kitty.Gutkowski@hotmail.com","Email doesn't match with the response");
        Assert.assertEquals(response.jsonPath().getString("users[0].username"),"Imani_Kihn9","username not matcihng with the repsponce");
        Assert.assertEquals(response.jsonPath().getString("users[0].phone"),"1-620-331-8298 x6968","phone number not matching with the responce");
        Assert.assertEquals(response.jsonPath().getString("users[0].address.street"),"489 W 6th Street","address not amtching with the response");
        Assert.assertEquals(response.jsonPath().getString("users[0].address.postalCode"),"05381-1378","postal code not matching with response");
        Assert.assertEquals(response.jsonPath().getInt("users[0].age"),29,"age not matched");

    }

    public static void getUserWithAge(int age){
        String completeUrl = baseURL + "/api/users";
        given()
                .when()
                .queryParam("age",age).
                get(completeUrl).then().statusCode(200).log().all();

    }

    public static void getWithGender(String g){
        RestAssured.baseURI = "https://fakeapi.in";
        given().
                when().
                queryParam("gender", g)
                .get("/api/users").then().statusCode(200).log().all();

    }

    public static void getWithCompany(String company){

        RestAssured.baseURI = "https://fakeapi.in";
        given().when().queryParam("company",company).get("/api/users").then().statusCode(200).log().all();
    }

    public static void getWithJob(String jobTitle){

        baseURI="https://fakeapi.in";
        given().when().queryParam("jobTitle",jobTitle).get("/api/users").then().statusCode(200).log().all();
    }

    public static void sortAsc(){

        baseURI = "https://fakeapi.in";
        given().when().queryParam("sortField","name").queryParam("sortOrder","asc")
                .get("/api/users").then().statusCode(200).log().all();
    }

    public static void pagination(int page){
        baseURI = "https://fakeapi.in/";
        given().when().queryParam("page",page).queryParam("limit",10)
                .get("/api/users").then().statusCode(200).log().all();
    }

    public static void combinedFilter(String sortField, String sortOrder, int page, int limit){
        baseURI = "https://fakeapi.in";
        given().when().queryParam("sortField",sortField).queryParam("sortOrder",sortOrder).
                queryParam("page",page).queryParam("limit",limit).get("/api/users").then().log().all();
    }

    public static void createNewUser(){
        String completeUrl = baseURL+ "/api/users";
        String requestBody = "{\n" +
                "  \"name\": \"Mrs. Adrienne Gibson\",\n" +
                "  \"email\": \"Toni.Reichert80@yahoo.com\",\n" +
                "  \"username\": \"Archibald.Renner\",\n" +
                "  \"phone\": \"765.917.6039 x37755\",\n" +
                "  \"website\": \"https://unpleasant-produce.net\",\n" +
                "  \"address\": {\n" +
                "    \"street\": \"10221 S Jefferson Street\",\n" +
                "    \"city\": \"Mariamfurt\",\n" +
                "    \"country\": \"Myanmar\",\n" +
                "    \"postalCode\": \"24518\"\n" +
                "  },\n" +
                "  \"company\": \"Hagenes, Krajcik and Howell\",\n" +
                "  \"jobTitle\": \"District Accountability Coordinator\",\n" +
                "  \"age\": 56,\n" +
                "  \"gender\": \"male\",\n" +
                "  \"createdAt\": \"2025-09-19T21:00:31.929Z\"\n" +
                "}";

        given().when().body(requestBody).post(completeUrl).then().statusCode(200).log().all();
    }

    public static void modifyData(){

        String completeUrl = baseURL + "/api/users/1";
        String requestBody = "{\n" +
                "  \"name\": \"Updated Name\",\n" +
                "  \"email\": \"updated@example.com\"\n" +
                "}";
        given().when().body(requestBody).put(completeUrl).then().statusCode(200).log().all();
    }
}
