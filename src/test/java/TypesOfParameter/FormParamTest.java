package TypesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParamTest {

	@Test
	public void sampleTest() {
	
		given()
		.formParam("projectId","NH_PROJ_9618")
		.log().all()                  //we are logging the request in console as URI have ProjectId just to check
		.when()
		.post("http://49.249.28.218:8091/project")
		.then()
		.log().all();                //we are logging the response
	} 
}
