package PanCardMock;

import org.mockito.Mockito;

class PANCARD{   
	                                 
	
	public  String isValid(String pancard) {
		
		/*business logic (Defining the Schema for Pancard i.e first five Uppercase,
        next four are number digit and last one is uppercase Letter */ 
		
		if (pancard.matches("[A-Z] {5} [0-9] {4} [A-Z]")==true) { // here matches() look after Validation
			return "is Valid PAN";
		} else {
			return "is IN Valid PAN";
		}
	}
	
	
	
	public static PANCARD getMockObject() { //Creating Stub/MockingSolution & MockData
		
	PANCARD mocObj	= Mockito.mock(PANCARD.class);
	                  Mockito.when(mocObj.isValid("ABCDE1234A")).thenReturn("Valid PAN");
	                  Mockito.when(mocObj.isValid("ABCDE1234B")).thenReturn("Valid PAN");
	                  Mockito.when(mocObj.isValid("ABCDE1234C")).thenReturn("INValid PAN");
	                  
	 return mocObj;
	}
	
	
}




public class PANCARDMockingTest {
	
	public static void main(String[] args) {
		
		PANCARD obj=PANCARD.getMockObject();   //it return PANCARD class object
		
		System.out.println(obj.isValid("ABCDE1234A")); // here we are getting reponse Valid PAN
		System.out.println(obj.isValid("ABCDE1234B"));
		System.out.println(obj.isValid("ABCDE1234C"));
		System.out.println(obj.isValid("ABCDE1234D")); // it will give NULL as it is not mockdata available in Mocking Server

	}
	

}