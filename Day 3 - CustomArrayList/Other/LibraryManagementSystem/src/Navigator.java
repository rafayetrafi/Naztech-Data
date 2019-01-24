import java.util.Scanner;




public class Navigator {
	
	Storage storage = new Storage();
	Action_Delete action = new Action_Delete();
	
	Scanner scn = new Scanner(System.in);
	//int choosedoption = scn.nextInt();
	
	
	public void switcher()
	{
	
		
		
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
		
		while(true)
		{
		
		int choosedoption = scn.nextInt();
		
		
		switch (choosedoption) {
		case 1:
			userInput();
			getAllBook();
			System.out.println("add successfully");
			
			
			
			break;
		case 2:
			System.out.println("-----------------View Books-----------------");
			getAllBook();
			
			
			//storage.locator();
			
			break;
		case 3:
			
			//action.deleteBook();
			
			//storage.deleteBook();
			delete();
	
			//storage.locator();
	break;
		case 4:
			

			////storage.locator();
	break;
		case 5:

			///storage.locator();
			break;
		default:
			System.out.println("Invalid input, Choose an right option. . !!");
			//storage.locator();
			break;
	}
	
		}
	}
	
	public void userInput() {
		System.out.println("-----------------------ADD BOOKS-----------------------");

		System.out.println("Please Enter Book Details");
		System.out.println();
		System.out.println();

		System.out.println("Enter Book ID: ");
		Scanner inBookID = new Scanner(System.in);

		Scanner inBookName = new Scanner(System.in);

		Scanner inBookQuantity = new Scanner(System.in);

		Scanner inAuthorName = new Scanner(System.in);

		int id = inBookID.nextInt();
		System.out.println("Enter Book Name: ");
		String Name = inBookName.nextLine();
		System.out.println("Enter Book Quantity: ");
		int bookQuantity = inBookQuantity.nextInt();
		System.out.println("Enter Book Author Name: ");
		String author = inAuthorName.nextLine();

		Book abook = new Book(id, Name, bookQuantity, author);
		
		storage.addBook(abook);
		
		//System.out.println(abook);
		
		/*
		 * Book book1 = new Book(1, "C Programming", 10, "Sheild"); Book book2 = new
		 * Book(2, "Java", 21, "Y. Daniel");
		 * 
		 * 
		 * storage.addBook(book1); storage.addBook(book2);
		 */

	}
	
	public void getAllBook()
	{
		
		
		Book[] bookList = storage.getBook();
		
		for(int i=0; i<storage.incrementor; i++)
		{
			System.out.println(bookList[i]);
		}
		
		
	}
	
	public void delete() {
		
		
		int enterID = 1;
		
		Book[] bookList = storage.getBook();
		System.out.println("okkkkkkkkkeeeeeeeeeeee");
		
		for(int i=0; i<storage.incrementor; i++)
		{
			//System.out.println(bookList[i]);
			System.out.println("okkkkkkkkk");
			
			if(bookList[i].equals(enterID))
			{
				bookList[i] = null;
				
				
			}
			
			
		}
		
	}
	
	
	
	
}
