package practice;


//learn method chaining and static import

import org.testng.annotations.Test;

import static com.backend.testing.B.*;

public class Run2 {
	
	@Test
	public void sampleTest() {
			
		a().b().c().d();      //method chaining & static import
		
		
	}
	
	

}
