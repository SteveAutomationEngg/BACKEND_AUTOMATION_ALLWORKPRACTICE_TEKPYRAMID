package Practice_serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run2_Deserialization {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream input = new FileInputStream("./ser_deser.txt");   //ser_deser.txt file avaiable in my workspace by FileInputStream java program mai laye
		
		ObjectInputStream objIn = new ObjectInputStream(input);    //it will help to achieve de-serialization 
		 NFSGame user1Obj= (NFSGame) objIn.readObject();      //Typecast the object to NFSGame class
		
		 System.out.println(user1Obj.name);
		 System.out.println(user1Obj.level);
		 System.out.println(user1Obj.score);
		 System.out.println(user1Obj.life);
		
	}

}
