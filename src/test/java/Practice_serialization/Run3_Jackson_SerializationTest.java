package Practice_serialization;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

class Project { // POJO class [Plain old java Object]

	// varaible
	private String projectName;
	private String createdBy;
	private int teamSize;
	private String status;

	// constructor
	public Project() {
	} // this empty constructor help me in deserialization

	public Project(String projectName, String createdBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	// getters and setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

public class Run3_Jackson_SerializationTest {

	public static void main(String[] args) throws Throwable {

		Project pObj = new Project("Ragnork", "Mohit", 0, "Created");

		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./project.json"), pObj);

		System.out.println("============>End<===========");

	}

}	
	
	
	
	

