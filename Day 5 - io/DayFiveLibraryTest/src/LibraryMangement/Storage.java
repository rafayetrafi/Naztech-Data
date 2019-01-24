package LibraryMangement;


import java.io.*;
import java.util.Scanner;

public class Storage {
	
	public static final String dir = "N:/Work/DayFiveLibraryTest/src";
	public static final String fileName = "Storage";
	
	BufferedReader bufReader;
	BufferedWriter bufWritter;
	File file;
	FileWriter fw;
	FileReader fr;
	
	Scanner scanner = new Scanner(System.in);
	//Book book;
	
	//Book book = new Book(1, "C Programming", 3, "Subeen");
	
	
	
	
	
	
	
	
	public void addBook()
	{
		
		try {
			
			Book book = new Book(1, "C Programming", 3, "Subeen");
			//System.out.println(book);
			
			file = new File(dir + fileName + ".txt");
			
			
			if (!file.exists()) {
		     file.createNewFile();
		     System.out.println("File Create Successfully");
		     
		     
		     	fw = new FileWriter(file, true);
				
		     	bufWritter = new BufferedWriter(fw);
				
				bufWritter.write(book.toString() + "\n");
				
				System.out.println("File Written Successfully");
				
				bufWritter.close();
		     
		     
			}
			else {
				fw = new FileWriter(file, true);
				
		     	bufWritter = new BufferedWriter(fw);
				
				bufWritter.write(book.toString() + "\n");
				
				System.out.println("File Written Successfully");
				
				bufWritter.close();
			}
			

			

			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
	}
	
	
	public void getAllBook()
	{
		try {
			
			
			file = new File(dir + fileName + ".txt");
			fr = new FileReader(file);
			
			bufReader = new BufferedReader(fr);
			
			String st; 
			  while ((st = bufReader.readLine()) != null) 
			    System.out.println(st); 
			  
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	public void userInput()
	{
		System.out.println("-----------------------ADD BOOKS-----------------------");

		System.out.println("Please Enter Book Details");
		System.out.println();
		System.out.println();

		System.out.println("Enter Book ID: ");
		int id = scanner.nextInt();
		System.out.println("Enter Book Name: ");
		String Name = scanner.nextLine();
		System.out.println("Enter Book Quantity: ");
		int bookQuantity = scanner.nextInt();
		System.out.println("Enter Book Author Name: ");
		String author = scanner.nextLine();
		
		//book = new Book(id, Name, bookQuantity, author);
		
	}

}
