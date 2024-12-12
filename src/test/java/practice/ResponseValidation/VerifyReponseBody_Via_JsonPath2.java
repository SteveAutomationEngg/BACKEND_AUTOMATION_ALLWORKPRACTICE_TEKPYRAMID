package practice.ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class VerifyReponseBody_Via_JsonPath2 {
	
	@Test
	public void verifyResponseBodyTest() {
		
		
	Response resp	= given().get("http://49.249.28.218:8091/projects-paginated");
	
	resp.then().log().all();
	
	//Validation
        /*here we have written JSON path for the specific key in the JSON Response pay load for validation
         */
	resp.then().assertThat().body("numberOfElements",Matchers.greaterThanOrEqualTo(20)); //in body() first paramter is the json path of the specific key
	                                                                                     //in RestAssured Json path don't start with .numberOfElements.
	resp.then().assertThat().body("pageable.sort.unsorted",Matchers.equalTo(true));
	
	resp.then().assertThat().body("content[0].projectId",Matchers.equalTo("NH_PROJ_948"));
	
	
	
	//Extract/capture the specific key data from Response PayLoad/body
	
	int data = resp.jsonPath().get("numberOfElements");   //jsonPath() is fromRestAssured Library to capture the key data
	System.out.println(data);
	
	boolean data1 = resp.jsonPath().get("pageable.sort.unsorted");
	System.out.println(data1);
	
	String data2 = resp.jsonPath().get("content[0].projectId");
	System.out.println(data2);
	
	}
	

}
