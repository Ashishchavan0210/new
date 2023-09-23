import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_PATCH {
	
	@Test
	public void Test_1_Patch() {
		JSONObject request = new JSONObject();
	    request.put("admin", "Employee");
	    request.put("College", "Student");
	    System.out.println(request.toJSONString());
	    
	     given().
	        header("Content-Type","Application/Json"). 
	        contentType(ContentType.JSON). 
	        accept(ContentType.JSON). 
	        body(request.toJSONString()).
	     when(). 
	        patch("https://reqres.in/api/users/2"). 
	     then(). 
	        statusCode(200).log().all();
	    
	
	}

}
