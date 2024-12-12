package com.sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForDeleteTest {
	
	@Test
	public void deleteDatainsideServer() {
		
		//Execute Http method : delete
	Response resp= RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_5363");
	
	//Log the response(Header and body) in console
	resp.then().log().all();
	
	//Validate the Response Status code
	resp.then().assertThat().statusCode(204);
	
	}

}
