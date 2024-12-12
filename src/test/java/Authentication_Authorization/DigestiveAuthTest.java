package Authentication_Authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DigestiveAuthTest {
	
	@Test
	public void sampleTest() {
		                                 //Ninza pay app support BasicAuth (Ninza HRM app support Oauth2.0)
	given()
	.auth().digest("rmgyantra", "rmgy@9999")
	.log().all()
	.when()
	.get("http://49.249.29.5:8091/login")
	.then()
	.log().all();
	}

}
