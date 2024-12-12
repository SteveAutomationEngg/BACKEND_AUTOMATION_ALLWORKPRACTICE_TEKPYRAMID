package Encryption_Decryption;

import java.util.Base64;

import org.testng.annotations.Test;

public class EncodeAndDecodeTest {
	
	@Test
	public void sampleTest() {
		
		//encoding of data -->ABC 
		String encodeData  = new String(Base64.getEncoder().encode("ABC".getBytes()));
		System.out.println(encodeData);
		
		//decoding 
		String decodeData = new String(Base64.getDecoder().decode("QUJD".getBytes()));
		System.out.println(decodeData);
		
		
		        System.out.println("===========><===================");
		
		//encoding of data --> rmgyantra:rmgy@9999
				String encodeData1  = new String(Base64.getEncoder().encode("rmgyantra:rmgy@9999".getBytes()));
				System.out.println(encodeData1);
				
				//decoding 
				String decodeData1 = new String(Base64.getDecoder().decode("cm1neWFudHJhOnJtZ3lAOTk5OQ==".getBytes()));
				System.out.println(decodeData1);
	}

}
