package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.Utility.ProjectPojo;

public class Scenerio_1_Delete_Project {
	
	@Test
	public void DeleteProjectFromServer() {
		

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
		
		//Capture Project ID from the Reponse
		String projectID= resp.jsonPath().get("projectId");
		System.out.println(projectID);
		
 
//API-2 ==> DELETE PROJECT
		given()
		    .delete("http://49.249.28.218:8091/project/"+projectID)
		
		    .then()
		       .log().all();
			
	
	}
}
