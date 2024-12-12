package TypesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PARAMParamTest {

	@Test
	public void sampleTest() {
	
		given()
		.param("projectId","NH_PROJ_9618")
		.log().all()                  //we are logging the request in console as URI have projectId just to check
		.when()
		.post("http://49.249.28.218:8091/project")
		.then()
		.log().all();                //we are logging the response
	} 
}

/* Param Parameter is generic parameter 
 * --> used with get("http://49.249.28.218:8091/project") act like Query parameter
 * --> used with Post("http://49.249.28.218:8091/project") act like Form parameter
 */
 