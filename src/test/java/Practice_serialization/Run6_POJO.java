package Practice_serialization;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;



class Project2 {          //POJO Class created by online POJO class generator (https://json2kt.com/json-to-pojo.php) , here you add the contructor and change the name of the POJO class.

	  //variables
	   String projectName;
	   String projectstatus;
	   int teamSize;
	   List<String> teamMember;
	   ProjectManager projectManager;

	   
        //constructor
	    public Project2(String projectName, String projectstatus, int teamSize, List<String> teamMember,
			ProjectManager projectManager) {
		super();
		this.projectName = projectName;
		this.projectstatus = projectstatus;
		this.teamSize = teamSize;
		this.teamMember = teamMember;
		this.projectManager = projectManager;
	}
	    
	    //getters and setters
		public void setProjectName(String projectName) {
	        this.projectName = projectName;
	    }
	    public String getProjectName() {
	        return projectName;
	    }
	    
	    public void setProjectstatus(String projectstatus) {
	        this.projectstatus = projectstatus;
	    }
	    public String getProjectstatus() {
	        return projectstatus;
	    }
	    
	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }
	    public int getTeamSize() {
	        return teamSize;
	    }
	    
	    public void setTeamMemeber(List<String> teamMember) {
	        this.teamMember = teamMember;
	    }
	    public List<String> getTeamMember() {
	        return teamMember;
	    }
	    
	    public void setProjectManager(ProjectManager projectManager) {
	        this.projectManager = projectManager;
	    }
	    public ProjectManager getProjectManager() {
	        return projectManager;
	    }
	    
	}

class ProjectManager {               // this also created from online POJO class generator where i have just passed the Json body.

	 //variable
	   String name;
	   String empID;

	   //constructor
	    public ProjectManager(String name, String empID) {
		super();
		this.name = name;
		this.empID = empID;
	}
	    //getters and setter
		public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
	    
	    public void setEmpID(String empID) {
	        this.empID = empID;
	    }
	    public String getEmpID() {
	        return empID;
	    }
	    
	}


public class Run6_POJO {
	
	public static void main(String[] args) throws Throwable {
		
	List<String> l1	= new ArrayList<String>();
	l1.add("rama");
	l1.add("shyama");
	l1.add("baba"); 
	
	
	ProjectManager pM = new ProjectManager("dharamNarayan", "tpo6");
		
	//POJO class object created
    Project2 projectObj = new Project2("Minion_01", "created", 10, l1,pM );
		
    //Serialization POJO object to JSON object
    ObjectMapper objM = new ObjectMapper();
    objM.writeValue(new File("./Project2.json"), projectObj);
	
    
    System.out.println("==========>POJO<===============");

	}

	
}
