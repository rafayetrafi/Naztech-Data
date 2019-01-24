import java.util.Scanner;


public class StartPoint {

	public static void main(String[] args) {
		
		
		BookStorage storage = new BookStorage();
		
		
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter an option");
		System.out.println();
		System.out.println();
		
		System.out.println("1 : Add Book");
		System.out.println("2 : View all Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Search Book");
		System.out.println("5 : Edit Book");
		
		
		System.out.println();
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		int choosedoption = scn.nextInt();
		
		
		switch (choosedoption) {
		case 1:
			storage.userInput();
			storage.savingBook();
			
			break;
		case 2:
			
			storage.showBook();
			
			break;
		case 3:
			
			storage.deleteBook();
	
			break;
		case 4:
	
			break;
		case 5:
	
			break;

		default:
			System.out.println("Invalid input, Choose an right option. . !!");
			break;
		}
		
		
		

	}

}
