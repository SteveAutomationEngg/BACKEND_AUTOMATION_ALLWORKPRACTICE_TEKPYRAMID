package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;   // RestAssured Class static import

public class SampleTestForCompleteUpdateTest {
	
	@Test
	public void putDataToServer() {
		
		// Json Body created
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy","Lebon");
		jsonObj.put("projectName","sarawati_01");
		jsonObj.put("status","Created");
		jsonObj.put("teamSize",0);
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.put("http://49.249.28.218:8091/project/NH_PROJ_5375")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
	}

}
