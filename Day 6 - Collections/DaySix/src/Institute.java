import java.util.*;


public class Institute {
	
		static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Map<String, Student> map = new HashMap<>();	
		
	
		while(true)
	
		{
	
			System.out.println("Id: ");
			String intID = scanner.nextLine();
			int id = Integer.parseInt(intID);
	
			System.out.println("Name: ");
			String name = readString();

	
			System.out.println("Dept: ");
			String dept = readString();
	
			System.out.println("Institute Name:");
			String ins = readString();
	

		  Department deptCSE1 = new Department(name, id, dept);
		  
//		  if(!map.containsKey(dept))
//		  {
//			  map.put(ins, deptCSE1);
//			  //System.out.println("123");
//			  
//		  }
//		  else
//		  {
//			  System.out.println("Data already exist");
//		  }
		  

		  
		  
		  //map.put(ins, deptCSE1);
		  //System.out.println(map);
		  
		  
		  
		  
		  
		  

		  
		  
	}
		 
	}
	
	
	
	private static String readString() {
		return scanner.nextLine();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private String instituationName;
//	
//	private List<Department> departments;
//	
//	
//	Institute(String instituationName, List<Department> departments) 
//    { 
//        this.instituationName = instituationName; 
//        this.departments = departments; 
//    }
//	
//	
//	public int getTotalStudent() 
//    { 
//        int noOfStudents = 0; 
//        List<Student> students;  
//        for(Department dept : departments) 
//        { 
//            students = dept.getStudents(); 
//            for(Student s : students) 
//            { 
//                noOfStudents++; 
//            } 
//        } 
//        return noOfStudents; 
//    }
//	
//	
//
//
//	public String getInstituationName() {
//		return instituationName;
//	}
//
//
//	public void setInstituationName(String instituationName) {
//		this.instituationName = instituationName;
//	}
//
//
//	public List<Department> getDepartments() {
//		return departments;
//	}
//
//
//	public void setDepartments(List<Department> departments) {
//		this.departments = departments;
//	}
	
	

}
