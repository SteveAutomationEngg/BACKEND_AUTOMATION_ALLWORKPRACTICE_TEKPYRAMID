package practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class SampleTestUsingMtdChainingTest {
	
	@Test
	public void getRequestTest() {
		
	
		get("https://reqres.in/api/users?page=2")
		.then()
		.log()
		.all();
		
		//then().log().all() here we get response header as well as body.
		
		System.out.println("===========><==============================");
		
		
		get("https://reqres.in/api/users?page=2").prettyPrint();
		
		//prettyprint , here we get response body/actual data only.
		
		
		
		
		
		
		
//  Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
//		
//		System.out.println(resp.prettyPrint());
//		
		
		
	}
	

}
