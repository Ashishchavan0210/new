import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_DELETE {
	
	@Test
	public void Test_Delete() {
		 when(). 
		   delete("https://reqres.in/api/users/2").  
		 then(). 
		   statusCode(204). 
		   log(). 
		   all();
		
	}

}
