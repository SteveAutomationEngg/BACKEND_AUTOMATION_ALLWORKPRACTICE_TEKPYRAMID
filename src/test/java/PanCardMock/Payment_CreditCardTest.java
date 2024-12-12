package PanCardMock;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Payment_CreditCardTest {
	
 @Test
 public void sampleTest() { 
	 //make sure the CreditCardMock [MOCKING SERVER] should be Running at the time of executing this
	 JSONObject obj = new JSONObject();
	 obj.put("creditcard","1234567891234");
	 obj.put("cvv","123");
	 obj.put("cardName","MohiBhaiya");
	 
	 given()
	 .contentType(ContentType.JSON)
	 .body(obj)
	 .log().all()
	 .when()
	 .post("http://localhost:8889/credit-card")   //local host  as mocking server running on my PC
	 .then().log().all();
 }

}
