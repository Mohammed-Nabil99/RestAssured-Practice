import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequest_Non_BDD {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/api/users";
        RequestSpecification request=RestAssured.given();
        request.queryParam("page","2");
        Response response=request.get();
        response.prettyPrint();


//        RestAssured.baseURI="https://reqres.in/api/users/2";
//        RequestSpecification request=RestAssured.given();
//        Response response=request.get();
//        response.prettyPrint();
    }
}
