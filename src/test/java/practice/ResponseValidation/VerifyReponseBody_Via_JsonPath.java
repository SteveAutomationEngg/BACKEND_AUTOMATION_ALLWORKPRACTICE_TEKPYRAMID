package practice.ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.ArrayList;
public class VerifyReponseBody_Via_JsonPath {
	
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

    ArrayList<String> lst = resp.jsonPath().get("content.projectId"); /* capturing all Project id that is list of element so in JSON path is content[*].projectId
                                                                           but regex(*) is not supported in RestAssure.We go for Complex JSON path dependency */ 
    System.out.println(lst);	
	}

}
