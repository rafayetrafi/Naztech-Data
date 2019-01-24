
public class Book {
	
	private int bookID;
	private String bookName;
	private String authorName;
	private int quantity;
	
	
	
	
	public Book(int bookID, String bookName, int quantity, String authorName) {
		this.authorName = authorName;
		this.bookID = bookID;
		this.bookName = bookName;
		this.quantity = quantity;
	}
	
	
	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	
	
	
	

}
