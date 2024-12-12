package com.sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCompleteUpdateTest {
	
	@Test
	public void putDataToServer() {
		
		// Json Body created
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy","john");
		jsonObj.put("projectName","jamuna_01");
		jsonObj.put("status","Created");
		jsonObj.put("teamSize",0);
		
		
		
		// Precondition
		RequestSpecification req= RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonObj.toJSONString());
		
		//Execute Http method:PUT
	Response resp	= req.put("http://49.249.28.218:8091/project/NH_PROJ_5363");
	//Log the response(Body and response) in the console
	resp.then().log().all();
	
	//Validate the Response Status Code
	 resp.then().assertThat().statusCode(200);	
	}

}
