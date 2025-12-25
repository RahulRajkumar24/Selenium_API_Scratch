//package API_Test;
//
//import static io.restassured.RestAssured.*;
//
//import io.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Get_Api {
//
//    @Test
//    public void test_1() {
//        given().get("https://reqres.in/api/users?page=2").
//                then().
//                statusCode(200).body("data.id[1]",equals(8)).body("data.first_name[1]",equals("Lindsay"));
//
////                 .body("data.id[1]", equalTo(8))
////                .body("data.first_name[1]", equalTo("Lindsay"));
//        // body("data.id[1]",eq)
////                body("data.id[1]", equals(8)).
////                body(("michael","data.first_name","Lindsay"));
//    //log().all();
//
//
//
//
//    }
//}
