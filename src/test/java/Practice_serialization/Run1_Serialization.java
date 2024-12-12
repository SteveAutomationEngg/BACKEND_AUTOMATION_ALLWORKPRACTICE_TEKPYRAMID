package Practice_serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  NFSGame implements Serializable{ //To achieve serialization-deserialization class must implement Serializable Interface as it is  marker interface which mark this class i.e NFS game is Serializable
	String name;
	int level;
	long score;
	int life;
	
	
	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
}


public class Run1_Serialization{
	
	public static void main(String[] args) throws Throwable {
		
		NFSGame user1Obj = new NFSGame("Mohit", 10, 70000, 2);
		
		FileOutputStream fileOut = new FileOutputStream("./ser_deser.txt"); //it will create file with name :ser_deser.txt in text format which is empty) 
		
		ObjectOutputStream objOut = new ObjectOutputStream(fileOut);     //it will help to achieve serialization 
		objOut.writeObject(user1Obj);
		
		System.out.println("===========>END<==============");
		
	}
	

}
