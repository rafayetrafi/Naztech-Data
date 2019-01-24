package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Institute {
	
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			
			//save
			
			
			
			
				int id;
				String name,dept,ins;
				
				System.out.println("Id: ");
				String intID = scanner.nextLine();
				
				id = Integer.parseInt(intID);

				System.out.println("Name: ");
				name = readString();


				System.out.println("Dept: ");
				dept = readString();

				System.out.println("Institute Name:");
				ins = readString();
				
				
				Student student = new Student(name,dept,ins);

				if(!map.containsKey(id))
				{
					map.put(id, student);
					System.out.println("Data added successfully");
					//System.out.println(map);
				}
				else
				{
					System.out.println("Data Already exist!");
					
					System.out.println("Change Data:---------------------------------------------- ");
					
					if(map.containsKey(id))
					{
						System.out.println("Want to update Data");
						
						String nname,ndept,nins;
						System.out.print("Name:");
						nname = sc.nextLine();
						System.out.print("Dept.:");
						ndept = sc.nextLine();
						System.out.print("Institute:");
						nins = sc.nextLine();
						
						
						Student student1 = new Student(nname, ndept, nins);
						//student = new Student(nname, ndept, nins);
						
						map.replace(id,student1);
						System.out.println("Data Update successfully");
						//System.out.println(map);
					}
					else
					{
						
					}
					
					//System.out.println(map.get(id));
			
				}
				
				System.out.println(map);
				
				
				
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("-------------Delete Data----------");
				
				//remove
				
				map.remove(id);
				System.out.println("Delete successfull");
				
				
				//map.remove(id);
				
				System.out.println("After Deleted:");
				
				System.out.println(map);

			
		}
		
		
	}
	
	public static void dataFile()
	{
		
		
	}
	
	public static void saveData() {
		
		dataFile();
		//Student student = new Student(name, dept,ins);
		
		

	}
	
	public static void updateData()
	{
		
		
		
	}
	
	
	
	
	
	
	private static String readString() {
		return scanner.nextLine();
		
		
		
		
	}

}
