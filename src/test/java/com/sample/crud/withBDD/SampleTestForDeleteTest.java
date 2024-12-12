package com.sample.crud.withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class SampleTestForDeleteTest {
	
	@Test
	public void deleteDatainsideServer() {
		
		given()
		.delete("http://49.249.28.218:8091/project/NH_PROJ_5375")
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
	}

}
