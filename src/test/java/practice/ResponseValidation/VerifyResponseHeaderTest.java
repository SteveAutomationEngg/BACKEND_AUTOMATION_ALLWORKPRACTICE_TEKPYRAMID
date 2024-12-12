package practice.ResponseValidation;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class VerifyResponseHeaderTest {
	
	@Test
	public void verifyHeader() {	
		
	Response resp	= given().get("http://49.249.28.218:8091/projects"); //store the response Object in the resp
	
	
	//log the response in console
	resp.then().log().headers();   //to log only the Response Header in Console
	//resp.then().log().status();    //to log  Only status line  of Response in console
	//resp.then().log().all();     //to log  complete Response in console
	
	resp.then().assertThat().contentType(ContentType.JSON);  //assertion method provided by rest assured library
	resp.then().assertThat().statusLine("HTTP/1.1 200 ");    
	resp.then().assertThat().statusCode(200);
	
	resp.then().assertThat().header("Transfer-Encoding", "chunked");	//assertion method provided by rest assured library to validate  particular key Data in Response header	 
	resp.then().assertThat().header("Pragma", "no-cache");		
	
	}

}
