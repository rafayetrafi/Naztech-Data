package Run;

import java.util.Scanner;

public class StartPoint {

	public static void main(String[] args) {

		AllBufferIO class1 = new AllBufferIO();
		
		Scanner scn = new Scanner(System.in);
		screenOptionPrint();
		
		while(true)
		{
			
			
			
			int key = scn.nextInt();
			
			switch (key) {
			case 1:
				class1.createFile();
				class1.userInput();
				class1.writeFile();
				
				
				break;
			case 2:
				
				class1.reWriteOnFile();
				
				break;
			case 3:
				class1.renameFile();
				
				break;
			case 4:
				class1.deleteFile();
				
				break;
			case 5:
				class1.readFile();
				break;
			case 9:
				System.out.println("Exit Successfully");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input. . . !!");
				break;
			}
			
			
		}
		
		
		
		
		
	}
	

	public static void screenOptionPrint()
	{
		System.out.println("");
		System.out.println("-----------Input output System-----------");
		System.out.println("");
		
		System.out.println("1: Create New File");
		System.out.println("2: Write File");
		System.out.println("3: Rename File");
		System.out.println("4: Delete File");
		System.out.println("5: Read File");
		System.out.println("9: Exit Program");
	}

}
