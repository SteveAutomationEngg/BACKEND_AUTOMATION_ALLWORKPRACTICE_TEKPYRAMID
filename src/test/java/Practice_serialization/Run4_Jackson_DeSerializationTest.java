package Practice_serialization;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Run4_Jackson_DeSerializationTest {

	public static void main(String[] args) throws Throwable {

		ObjectMapper objM = new ObjectMapper();

		Project pObj = objM.readValue(new File("./project.json"), Project.class);

		System.out.println(pObj.getProjectName());
		System.out.println(pObj.getTeamSize());
		System.out.println(pObj.getStatus());
		System.out.println(pObj.getCreatedBy());

	}
}
