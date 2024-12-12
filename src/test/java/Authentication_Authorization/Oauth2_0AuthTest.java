package Authentication_Authorization;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0AuthTest {
	
	@Test
	public void sampleTest() {
	
//API1 ==> GET AUTH             (here in formParam()we passed the credential & POST URL provided by the developer for authenticate)
		                        //as Ninza HRM app support Oauth 2.0
	
		Response resp= given()
		                  .formParam("client_id", "ninza-client")
		                  .formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
		                  .formParam("grant_type", "client_credentials")
		.when()
		    .post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		
		resp.then().log().all();
		
//CAPTURE THE TOKEN FROM THE RESPONSE [KeyCloak-->open source tool client app used by HRM app for Oauth2.0 token generator)
		 String token= resp.jsonPath().get("access_token");
		
			
//API2 ==> GET PAYROLL INFO
		given()
		.auth().oauth2(token)
		.log().all()
	   .when()
		  .get("http://49.249.28.218:8091/admin/payrolls")
		.then()
		 .log().all();	
		
	}

}
