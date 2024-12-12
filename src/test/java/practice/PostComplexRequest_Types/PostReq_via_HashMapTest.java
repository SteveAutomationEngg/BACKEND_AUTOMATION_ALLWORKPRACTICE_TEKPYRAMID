package practice.PostComplexRequest_Types;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReq_via_HashMapTest {

	@Test
	public void postDataToServer() {
		
		//Json Body
		HashMap<String , Object> map = new HashMap<String, Object>();    // in json pay load we get from Cx --> key in String & value can be anything so, Object
		
		map.put("createdBy","Mohit");
		map.put("projectName","captainAmericaproject_09");
		map.put("status","Created");
		map.put("teamSize",0);
	
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
		
	}
}
