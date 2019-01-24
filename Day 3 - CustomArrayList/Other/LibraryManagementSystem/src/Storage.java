
public class Storage {
	
	
	public static Book[] bookList = new Book[100];
	static int incrementor = 0;
	
	
		
	
	public void addBook(Book bookObj)
	{
		bookList[incrementor++] = bookObj;
	}
	
	public Book[] getBook()
	{
		return bookList;
	}
	
	
	public void deleteBook()
	{
		System.out.println(bookList.length);
		
		
		
	}

	
	
	
	

}
