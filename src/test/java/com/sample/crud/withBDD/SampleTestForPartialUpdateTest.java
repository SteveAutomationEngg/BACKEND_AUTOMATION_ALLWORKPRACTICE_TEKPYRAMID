package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class SampleTestForPartialUpdateTest {
	
	@Test
	public void patchDataToServer() {
		
		// Json Body created
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("createdBy","Babaji");
		
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.patch("http://49.249.28.218:8091/project/NH_PROJ_5375")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	
	}

}
