package com.sample.crud.withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCreateTest {
	
	@Test
	public void postDataToServer() {
		
		//Json Body
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy","Raja");
		jsonObj.put("projectName","Verna_01");
		jsonObj.put("status","Created");
		jsonObj.put("teamSize",0);
		
		
		//Pre condition
		RequestSpecification req= RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonObj.toJSONString());
		
	//Execute  Http Method:post
	Response resp	= req.post("http://49.249.28.218:8091/addProject");
	
	//log the response( Header and Body) in Console
	resp.then().log().all();
	
	//Validate The Response status code
	 resp.then().assertThat().statusCode(201);	
	}

}
