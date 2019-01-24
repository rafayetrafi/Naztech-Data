package Run;

import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class AllBufferIO {

	public static final String dir = "N:/Work/DayFive/src/";
	
	BufferedReader bufReader;
	BufferedWriter bufWritter;
	File file;// = new File("N:/Work/DayFive/src/file1.txt");
	FileWriter fw;
	FileReader fr;
	
	Scanner scanner = new Scanner(System.in);
	
	private String getInputData;
	


	public void userInput()
	{
		try {
			System.out.println("Write Somethig:");
			bufReader = new BufferedReader(new InputStreamReader(System.in));
			setGetInputData(bufReader.readLine());
			//System.out.println(getInputData);			
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception Occured");
		}

	}
	
	
	
	public void createFile()
	{
		try {
			
			System.out.println("Enter File Name: ");
			
			//Scanner sc = new Scanner(System.in);
			//String fName = new Scanner(System.in).nextLine();
			
			String fName = scanner.nextLine();
			
			
			file = new File(dir + fName + ".txt");
			
			
				if (!file.exists()) {
			     file.createNewFile();
			     System.out.println("File Create Successfully");
			     System.out.println("");
				}
				else {
					System.out.println("File Already exist & You can write.");
					System.out.println("");
				}
				
				
		}catch (Exception e) {
			System.out.println("File not Created");
		
		}
	}
	
	
	
	
	
	public void writeFile()
	{
		try {
			
//			file = new File("N:/Work/DayFive/src/file1.txt");
//			
//				if (!file.exists()) {
//			     file.createNewFile();
//				}
					
			
//			FileWriter fw = new FileWriter(file);
			
			fw = new FileWriter(file, true);
			
			bufWritter = new BufferedWriter(fw);
			
			bufWritter.write(getGetInputData());
			
			System.out.println("File Written Successfully");
			
			bufWritter.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Data not found");
		}
		
		
		
	}
	
	public void reWriteOnFile()
	{
		showAllFolder();
		
		System.out.println("");
		System.out.print("Enter file Name to write: ");
		String fNameRewrite = scanner.nextLine();
		
		file = new File(dir + fNameRewrite + ".txt");
		
		if(file.exists())
		{
			userInput();
			writeFile();
		}

	}
	
	
	
	public void renameFile()
	{
		
		try {
	
				System.out.println("Enter old file name: ");
				
				//Scanner ss = new Scanner(System.in);
				String on = scanner.nextLine();
				
				
				System.out.println("Enter new file name: ");
				
				//Scanner ss = new Scanner(System.in);
				String nn = scanner.nextLine();
				
				File renamer = new File(dir + on +".txt");
				
				if (renamer.exists()) {
					
					
					renamer.renameTo(new File(dir + nn + ".txt"));
					System.out.println("Rename Successfully. . !!");
				     
					}
				else
					System.out.println("Old File Not Found. . !!");
				

		} catch (Exception e) {

			System.out.println(e);
		}
		

	}
	
	
	public void showAllFolder()
	{
		
		System.out.println("-------Available Files-------");
		File f = new File(dir);
		for (File file : f.listFiles())
		{
			if(file.getName().endsWith("txt")){
				System.out.print(file.getName() + ", ");
			}
		}
		System.out.println("");
		System.out.println("");
		
	}
	
	
	public void deleteFile()
	{
		showAllFolder();
		
		System.out.println("");
		System.out.println("-----------Want to delete file-----------");
		System.out.print("Enter file Name: ");
		
		String input = scanner.nextLine();
		
		File f = new File(dir + input + ".txt");
		
		
		if (f.exists())
		{
			f.delete();
			System.out.println("Delete Successfully");
		}else {
			System.out.println("File not Found.");
		}
		
	}
	
	public void readFile()
	{
		try {
			
			
			showAllFolder();
			System.out.println("---------File Reader-----------");
			System.out.println("");
			System.out.print("Enter File Name to read: ");
			scanner = new Scanner(System.in);
			String readAbleFileName = scanner.nextLine();
			
			file = new File(dir + readAbleFileName + ".txt");
			fr = new FileReader(file);
			
			bufReader = new BufferedReader(fr);
			
			System.out.println(bufReader.readLine());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
	
	
	

	
	public String getGetInputData() {
		return getInputData + " ";
	}

	public void setGetInputData(String getInputData) {
		this.getInputData = getInputData;
	}

}
	

