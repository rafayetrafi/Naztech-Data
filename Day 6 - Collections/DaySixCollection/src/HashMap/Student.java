package HashMap;

public class Student {
	
	private int id;
	private String name;
	private String dept;
	private String institute;
	
	
	public Student(int id, String name, String dept, String institute) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.institute = institute;
	}


	public Student(String name, String dept, String institute) {
		super();
		this.name = name;
		this.dept = dept;
		this.institute = institute;
	}


	@Override
	public String toString() {
		return "     Name:" + name + ", Department:" + dept + ", Instituation:" + institute + "";
	}
	
	
	
	
	
	

}
