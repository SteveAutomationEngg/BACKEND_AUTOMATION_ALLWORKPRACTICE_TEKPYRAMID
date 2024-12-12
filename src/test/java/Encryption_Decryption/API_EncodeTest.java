package Encryption_Decryption;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class API_EncodeTest {
	                         //on executing this script we are getting a Encoded username & pwd in header of request 
	                         // so dont go with preemptive authentication go with digestive authentication
	@Test
	public void sampleTest() {       
		                                 
	given()
	  .auth().preemptive().basic("rmgyantra", "rmgy@9999")
	 .log().all()
	.when()
	   .get("http://49.249.29.5:8091/projects")
	.then().log().all();
	}
 
	
}
