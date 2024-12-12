package Practice_serialization;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

// by this @JsonPropertyOrder the order of key available in POJO class will be arranged as per my provided order.
@JsonPropertyOrder(
		value = { "createdBy",
				  "projectName",
				  "teamSize",
				  "status"		  
		}
		
		)

// by this @JsonIgnoreProperties we will not expose this team size variable of POJO class in JSON FILE 
@JsonIgnoreProperties(
		
		value = { 
				"teamSize"
				
		   },allowSetters = true
		)


class Project1{                   //POJO class [Plain old java Object]
	
	private String projectName;
	@JsonProperty(value = "created By")   // createdBy variable of this POJO class will now reflect as created By key in Json file
	private String createdBy;
	private int teamSize;
	private String status;
	
	
	public Project1() {}    

	
	public Project1(String projectName, String createdBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

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

	
	
public class Run5_Jackson_JACKSONANNOTATION {

	public static void main(String[] args) throws Throwable {
		
		Project1 pObj = new Project1("Ragnork_001","Mohit",0,"Created");
		
		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./project1.json"), pObj);
		
		System.out.println("============>End<===========");
		
	}
		
	
	}
	
	
	
	
	

