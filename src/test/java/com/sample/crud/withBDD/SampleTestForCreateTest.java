package com.sample.crud.withBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class SampleTestForCreateTest {
	
	@Test
	public void postDataToServer() {
		
		//Json Body
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy","RangRaja");
		jsonObj.put("projectName","Vernoica_01");
		jsonObj.put("status","Created");
		jsonObj.put("teamSize",0);
	
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}

}
