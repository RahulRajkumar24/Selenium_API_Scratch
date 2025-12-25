package API_Test;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Post_api {

    @Test
    public void test_(){
  //  HashMap<String , Object> map= new HashMap<>();
    //map.put("name", "Rahul");
    //map.put("job","SDET");

        JSONObject request = new JSONObject();
        System.out.println(request);
        System.out.println(request.toJSONString());
        request.put("name","Rahul");
        request.put("job","SDET");
    }
@Test
    public void test_2_put(){
        given().put("https://reqres.in/api/users?page=2");

}

}

