package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProject_DPandExcelTest {
	
	@Test(dataProvider = "getData" )
	public void sampleTest(String pName, String status) {
		
		//JSON payload by String variable
		String reqBody = "{\r\n"
				+ "  \"createdBy\": \"MOHIT\",\r\n"
				+ "  \"projectName\": \""+pName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.log().all();	
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable {
		
		ExcelUtility eLib = new ExcelUtility();
	    int count= eLib.getRowcount("project");
	    
		Object[][] objarr = new Object[count][2];
		
		
		for(int i=0; i<count; i++) {
			
			objarr[i][0]=eLib.getDataFromExcel("project", i+1, 0);
			objarr[i][1]=eLib.getDataFromExcel("project", i+1, 1);
			
		}
		
		return objarr;
	}

}
