import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddBooks extends Books {
	
	
	
	
	

	public void addingBook()
	{
		
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
	
	
	
	
	
	
	
	

	
	

	@Override
	public String toString() {
		return "AddBooks [getAuthorName()=" + getAuthorName() + ", getBookID()=" + getBookID() + ", getBookName()="
				+ getBookName() + ", getQuantity()=" + getQuantity() + "]";
	}












	public AddBooks() {
		// TODO Auto-generated constructor stub
	}
	
	

}
