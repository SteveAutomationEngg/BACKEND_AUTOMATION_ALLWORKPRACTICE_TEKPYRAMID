package practice;


//learn static import

import org.testng.annotations.Test;

import static com.backend.testing.A.*;   //Static  Import now, no use of calling the static method by class reference

public class Run1 {

	@Test
	public void sampleTest() {
		given();
		when();
		then();
	}
}
