import java.util.List;

public class Department extends Student {
	
	



	private String deptName;
	//private List<Student> students; 
    
    
//    Department(String deptName, List<Student> students)  
//    { 
//          
//        this.deptName = deptName; 
//        this.students = students; 
//          
//    } 
	

	
	Department(String name, int id, String deptName) {
		super(name, id);
		this.deptName = deptName;
		// TODO Auto-generated constructor stub
	}

    

	public String getDeptName() {
		return deptName;
	}
	
	
	

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	@Override
	public String toString() {
		return "Department [Department Name: " + getDeptName() + ", Student Name: " + getName() + ", Student ID: " + getId() + "]";
	}
	
	
	 

}
