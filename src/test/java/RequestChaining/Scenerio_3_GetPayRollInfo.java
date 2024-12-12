package RequestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class Scenerio_3_GetPayRollInfo {
	
	@Test
	public void sampleTest() {
	
//API1 ==> GET AUTH             (here in formParam()we passed the credential & POST URL provided by the developer for authenticate)
		
	Response resp= given()
		.formParam("client_id", "ninza-client")
		.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
		.formParam("grant_type", "client_credentials")
		.when()
		.post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		
		resp.then().log().all();
		
//CAPTURE THE TOKEN FROM THE RESPONSE
		String token= resp.jsonPath().get("access_token");
		
			
//API2 ==> GET PAYROLL INFO
		given()
		.auth().oauth2(token)
		.get("http://49.249.28.218:8091/admin/payrolls")
		.then()
		.log().all();
		
		
		
	}

}
