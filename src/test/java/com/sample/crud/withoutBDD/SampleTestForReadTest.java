package com.sample.crud.withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForReadTest {
	
	@Test
	public void getDataFromServer() {
		
		//Execute Http Method:Get
		Response resp =RestAssured.get("http://49.249.28.218:8091/projects");
		
		                                            //System.out.println(resp.asString());
	    
		                                            //System.out.println(resp.prettyPrint());
        // log the Response (header and body) in console
		resp.then().log().all();
         //Validate the status code from response
		 resp.then().assertThat().statusCode(200);
		
	}

}
