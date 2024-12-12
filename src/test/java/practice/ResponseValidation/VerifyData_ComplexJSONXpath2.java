package practice.ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class VerifyData_ComplexJSONXpath2 {
	
	
	@Test
	public void verifyResponseBodyTest() {
		
		
	Response resp	= given().get("http://49.249.28.218:8091/projects-paginated");
	
	resp.then().log().all();
	
	/*
	 * to capture/extract the Complex JSON path i.e ProjectID from JSON payload 
	 * added the Jayway - Json path Dependency to pom.xml
	 */
	
    //capture the ProjectID based on the Project Namei.e projectName=='Airtel1027701110 capture its projectId
	List<String> lst1= JsonPath.read(resp.asString(),".content[*].[?(@.projectName=='Airtel1027701110')].projectId");
	String actProjectID=lst1.get(0);
	
	Assert.assertEquals(actProjectID, "NH_PROJ_948");

	
	
	
/*
 * we bascially have to capture the specific key data from the Complex JSON response body
 * and from that captured data we will make use in the 
 *1) Database validation
 *2) Request Chaining 
 */
}
}