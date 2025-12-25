package API_TEST_2;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_POST_Request_Register_Customer_Api {

    @Test
    public void RegistrationSuccessfull()
    {

        //Specify base url
        RestAssured.baseURI="http://restapi.demoqa.com/customer"    ;

        //Request object
        RequestSpecification httprequest = RestAssured.given();

        //Request paylaod sending along with post request
        JSONObject requestparams= new JSONObject();
        requestparams.put("FirstName","JohnXYZ");
        requestparams.put("LastName","XYZJohn");
        requestparams.put("UserName","JohnXYZ");
        requestparams.put("Password","JohnXYZxyx");
        requestparams.put("Email","JohnXYZ@gmail.com");

        httprequest.header("Content-Type","application/json");

        httprequest.body(requestparams.toJSONString()); //attach above data to the request

        //Response object
        Response reponse=httprequest.request(Method.POST,"/register");

        //print response in console window
        String responseBody = reponse.getBody().asString();
        System.out.println("responseBody is :"   +responseBody);

        //status code validation
        int StatusCode=reponse.getStatusCode();
        System.out.println("the Status code is :"   + StatusCode);
        Assert.assertEquals(StatusCode,201);


        //success code validation

        String SuccessCode=reponse.jsonPath().get("Success code");
        System.out.println("the SuccessCode is:" +SuccessCode);
        Assert.assertEquals(SuccessCode,"OPERARION_SUCCESS");

    }



}
