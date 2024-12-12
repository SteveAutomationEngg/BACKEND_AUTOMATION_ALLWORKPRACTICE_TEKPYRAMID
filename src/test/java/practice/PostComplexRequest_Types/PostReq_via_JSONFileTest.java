package practice.PostComplexRequest_Types;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReq_via_JSONFileTest {

	@Test
	public void postDataToServer() {
		
		//Json Body
		File fileobj = new File("./BlackWidowProject.json");
	
		given()
		.contentType(ContentType.JSON)
		.body(fileobj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}
}
