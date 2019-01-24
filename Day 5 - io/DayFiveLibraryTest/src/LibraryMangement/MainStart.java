package LibraryMangement;

public class MainStart {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		//Books [bookID=1, bookName=C Programming, authorName=Subeen, quantity=12]
		
		storage.addBook();
		//storage.getAllBook();
		storage.getAllBook();

		
		
		
		
		
		
	}
	
	
	
	public static void screenOptionPrint()
	{
		System.out.println("");
		System.out.println("-----------Library Management System-----------");
		System.out.println("");
		
		System.out.println("1: Add Book");
		System.out.println("2: Edit Book");
		System.out.println("3: Delete Book");
		System.out.println("4: View All Book");
		System.out.println("9: Exit Program");
	}

}
