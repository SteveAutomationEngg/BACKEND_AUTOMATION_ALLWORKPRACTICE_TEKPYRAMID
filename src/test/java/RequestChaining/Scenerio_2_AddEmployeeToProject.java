package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.Utility.EmployeePOJO;
import pojoclass.Utility.ProjectPojo;

public class Scenerio_2_AddEmployeeToProject {

	@Test
	public void addEmployeeToProject() {
		
		        Random random = new Random();
		        int ranNum =random.nextInt(5000);
		        
	//API -1 ===> ADD A PROJECT IN SIDE SERVER	
		        
		        //create an object to POJO class   ~ for json payload 
		ProjectPojo pObj = new ProjectPojo("Ironman_"+ranNum, "Created", "Mohit", 0);
		

	Response resp	= given()
		.contentType(ContentType.JSON)
		.body(pObj)
		.when()
		.post("http://49.249.28.218:8091/addProject");
	
		resp.then()
		.assertThat().statusCode(201)
		.log().all();
		
		//Capture Project Name from the Reponse
		String projName= resp.jsonPath().get("projectName");
		System.out.println(projName);
		
		
//API -2 ==>  ADD EMPLOYEE TO SAME PROJECT

		EmployeePOJO empObj = new EmployeePOJO("Architect", "20/11/2024", "mohitbaba@gmail.com","user"+ranNum ,12, "1234567890", projName,"ROLE_EMPLOYEE","user"+ranNum);

		given()
		.contentType(ContentType.JSON)
		.body(empObj)
		.when()
		.post("http://49.249.28.218:8091/employees")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	
	}	
}
