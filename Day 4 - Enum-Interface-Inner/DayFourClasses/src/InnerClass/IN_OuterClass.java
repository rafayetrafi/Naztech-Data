package InnerClass;

import MainFunc.Navigator;


public class IN_OuterClass extends Person {


	private class IN_InnerClass{
		
		
		
		
		String getFullName()
		{
			
			
			return getFirstName() + " " + getMiddleName() + " " + getLastName(); 
		}
		
		
	}
	
	
	public void printer()
	{
		
		
		setFirstName("Rafayet");
		setMiddleName("Hossain");
		setLastName("Rafi");
		
		
		IN_InnerClass inner = new IN_InnerClass();
		
		System.out.println("This data Came from Inner Class. . !!");
		
		System.out.println(inner.getFullName());
		
		reLocator();
		
	}
	
	
	public static void reLocator()
	{
		Navigator nav = new Navigator();
		nav.switcher();
	}
	
	
	

	

}
