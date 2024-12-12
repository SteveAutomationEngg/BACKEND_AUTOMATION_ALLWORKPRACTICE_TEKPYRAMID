package practice.ResponseValidation;

import static io.restassured.RestAssured.*;    //static import

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class VerifyResponseTimeTest {

	@Test
	public void verifyResponseTime() {

		Response resp = given().get("http://49.249.28.218:8091/projects");

		resp.then().log().all();

		Long timeTaken = resp.time(); // give time in Milliseconds [1 s= 1000 ms]
		System.out.println(timeTaken);

		Long timeTakenInSec = resp.timeIn(TimeUnit.SECONDS); // give time in second
		System.out.println(timeTakenInSec); // getting zero means it is less than 1 second

	    //validation
		/*Matcher class comes from hamcrest package of RestAssured library which is used to vlidate the response time,
		 *  as it provide the provision for greater than , less than 
		 */
		
		resp.then().assertThat().time(Matchers.lessThan(900L));  //validating response time less than 900 ms (L means Long)
		
		resp.then().assertThat().time(Matchers.greaterThan(300L));
		
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(300L)));
		
		
	}

}
