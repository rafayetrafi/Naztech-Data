package MainFunc;
import java.util.Scanner;

import AnnoynmusClass.Annoynmus;
import EnumClass.DayCounter;
import InnerClass.IN_OuterClass;

public class Navigator {

	
	public void switcher()
	{
		System.out.println();
		System.out.println("Enter an option");
		System.out.println();
		
		System.out.println("1 : Inner Class");
		System.out.println("2 : Anonymous Class");
		System.out.println("3 : Enum Class");
		System.out.println("4 : .......");
		System.out.println("9 : Exit");
		
		
		System.out.println();
		
		
		
		Scanner scn = new Scanner(System.in);
		int choosedoption = scn.nextInt();
		
		
		
		
		switch (choosedoption) {
		case 1:
			
			IN_OuterClass in_outerClass = new IN_OuterClass();
			in_outerClass.printer();
			
			
			
			break;
		case 2:
			
			Annoynmus ann = new Annoynmus();
			
			System.out.println("This Data Came from Anonymous Class: ");
			System.out.println(ann.getFullName());
			
			InnerClass.IN_OuterClass.reLocator();
			
			
			break;
		case 3:
			
			DayCounter dayCounter = new DayCounter();
			dayCounter.monthDayFinder();
			
			InnerClass.IN_OuterClass.reLocator();
	
	
	break;
		case 4:
			
			InnerClass.IN_OuterClass.reLocator();

	
	break;
		case 9:
			System.out.println("Exit Successfully. . .!!");
			System.exit(0);
			

			
			break;
		default:
			System.out.println("Invalid input, Choose an right option. . !!");
			InnerClass.IN_OuterClass.reLocator();
			
			break;
	}
	

	}

}
