package Authentication_Authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenAuthTest {
	
	@Test
	public void sampleTest() {
		                      // Ninza HRM app support Oauth2.0 here developer has given me the bearer token
		                      // i get this bearer token from NINZA HRM app --> setting  
	given()
	 .auth().oauth2("pINXBFWkNNIn0.eyJleHAiOjE3MzIxNjk3NjgsImlhdCI6MTczMjE2Nzk2OCwianRpIjoiYWE2ZTBiM2QtYmE0ZC00MTY5LTlmN2UtNmRlYTVmMTMyNWI1IiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiMWY5YWVlYjQtYjkyMS00OWE1LTgxZDktNzUyOTI5YTAzYzk0IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiMWY5YWVlYjQtYjkyMS00OWE1LTgxZDktNzUyOTI5YTAzYzk0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.FHJ-BnKIGsrdQkoQ6FMOwf2pQ5Y8VJIEYqqGjfdbYZut-tbElG5mZxu4PDGarEmwIQ9n5uf2dKGh42NyrCOG5igarTri5EtQxNSk6KDkgC_pi4YZ_DSyWdcZ0RUFpbVUoWaVbv6pc-hORLp3Y8IGz5jmEASwBVwKIO3i36mR24BoBOTL4UOMOXZbkgVngAQbIbx7v9INAMuJxIVID38nZumGROpQGL3HCglkK0Cu57pDS1ijMWl38VboDYYGKx6nd8gM4HHM48ejW480v4_n11x7sOxP-58UxYA41ValkQgDjVO2NHpUDXcw6-EsrfY7sS_JZhUFhE38z0yE11R0Jw")
	 .log().all()
	.when()
	 .get("http://49.249.28.218:8091/projects")
	.then()
	 .log().all();
	}

}
