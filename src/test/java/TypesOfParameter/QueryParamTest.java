package TypesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParamTest {

	@Test
	public void sampleTest() {
	
		given()
		.queryParam("teamsize",5)
		.log().all()                        //we are logging the request in console as URI have teamsize just to check
		.when()
		.get("http://49.249.28.218:8091/project")
		.then()
		.log().all();                       //we are logging the response
	}
}
