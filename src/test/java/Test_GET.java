import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static io. restassured.RestAssured.*;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_GET {
	
	@Test
	void Test_001() {
		
		Response response =get("https://reqres.in/api/users?page=2");
    	System.out.println(response.getStatusCode());
		System.out.println(response.statusLine());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		
		int statuscode= response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		Reporter.log("Test_001");
		
	}
	@Test
	void Test_002() {
		given()
		   .get("https://reqres.in/api/users?page=2")
		.then()
		   .statusCode(200)
		   .body("data.id[0]", equalTo(7));
	}
	
	
	

}
