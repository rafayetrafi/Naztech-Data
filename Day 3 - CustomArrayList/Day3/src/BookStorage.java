import java.util.ArrayList;
import java.util.Scanner;

public class BookStorage extends Books {

	static ArrayList<Books> bookList = new ArrayList<Books>();

	public void savingBook() {
		
		Books bk1 = new Books(1, "C Programming", 10, "harvard shield");
		Books bk2 = new Books(2, "Java", 21, "ABCD");

		Books abook = new Books(getBookID(), getBookName(), getQuantity(), getAuthorName());

		bookList.add(bk1);
		bookList.add(bk2);
		bookList.add(abook);

		// System.out.println("Book Added Successfully. . !!");
		
		for(int i = 0; i < bookList.size(); i++) {
			 System.out.println(bookList.get(i)); }

	}

	public void showBook() {
		//savingBook();
		// System.out.println(bookList);
		/*
		 * for(int i = 0; i < bookList.size(); i++) {
		 * System.out.println(bookList.get(i)); }
		 */
		
		savingBook();

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

		setBookID(id);
		setBookName(Name);
		setQuantity(bookQuantity);
		setAuthorName(author);

	}
	
	
	public void deleteBook()
	{
		
		System.out.println("--------------Delete Book--------------");
		System.out.println();
		System.out.println();
		
		System.out.println("Enter id number for deleting . . !!");
		
		
		
		Scanner deleteID = new Scanner(System.in);
		
		
		
		int dlt = deleteID.nextInt();
		
		showBook();
		
		bookList.remove(new Integer(dlt));
		
		//showBook();
		
		
	}
	
	public void addBook()
	{
		
		
		
	}

}
