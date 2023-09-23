import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_PUT {

	@Test
	public void Test_1_Put() {
		JSONObject request =new JSONObject();
		request.put("Indian", "Ashish");
		request.put("Army", "akshay");
		System.out.println(request.toJSONString());
		
		given().
		    header("Content-Type" ,"Application/JSON").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		when().
		   put("https://reqres.in/api/users/2").
	    then().statusCode(200).log().all();
		
	}
}
