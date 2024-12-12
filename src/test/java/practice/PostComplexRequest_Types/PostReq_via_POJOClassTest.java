package practice.PostComplexRequest_Types;

import static io.restassured.RestAssured.*;


import java.util.Random;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import pojoclass.Utility.ProjectPojo;

public class PostReq_via_POJOClassTest {

	@Test
	public void postDataToServer() {
		
		
		 //create an object to POJO class   ~ for json payload 
		        Random random = new Random();
		        int ranNum =random.nextInt(5000);
		        
		ProjectPojo pObj = new ProjectPojo("Ironman_"+ranNum, "Created", "Mohit", 0);
		
		
		
		
		given()
		.contentType(ContentType.JSON)
		.body(pObj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}
}
