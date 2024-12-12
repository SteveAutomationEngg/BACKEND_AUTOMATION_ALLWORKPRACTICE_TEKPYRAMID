package practice.ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;


import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class VerifyData_ComplexJSONXpath {
	
	
	@Test
	public void verifyResponseBodyTest() {
		
		
	Response resp	= given().get("http://49.249.28.218:8091/projects-paginated");
	
	//resp.then().log().all();
	
	/*
	 * to capture/extract the Complex JSON path i.e ProjectID from JSON payload 
	 * added the Jayway - Json path Dependency to pom.xml
	 */
	
List<String> lst= JsonPath.read(resp.asString(),".content[*].projectName"); // this read() always return arrayList
	
System.out.println(lst);

for(String data: lst) {	
	System.out.println(data);
}


	}
	
	
}
