import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest_Non_BDD {
    public static void main(String[] args) {


        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body("{\"name\": \"morpheus\",\"job\": \"leader\"}");
        Response response = request.post();
        response.prettyPrint();
}}
