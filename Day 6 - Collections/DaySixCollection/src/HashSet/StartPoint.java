package HashSet;

import java.util.HashSet;

public class StartPoint {

	public static void main(String[] args) {
		
		
		System.out.println("-----------------------All ABOUT HASH-SET-----------------------");
		System.out.println("");
		
		 HashSet<String> hashSet=new HashSet<String>();
		 
		 hashSet.add("Rafi");  
         hashSet.add("Hossain");  
         hashSet.add("Suddam");  
         hashSet.add("Siam");  
         System.out.println("Total Data: "+hashSet); 
         
         System.out.println("");
         System.out.println("");
         
         
         
         hashSet.remove("Rafi");
         System.out.println("After removing: "+hashSet);
         
         
         
         System.out.println("");
         System.out.println("");
         
         
         HashSet<String> set1=new HashSet<String>();  
         set1.add("Rana");  
         set1.add("Naztech");  
         hashSet.addAll(set1);  
         System.out.println("After Updated: "+hashSet);
         
         
         
        System.out.println("-----------------------Other Class Data-----------------------");
 		System.out.println("");
         
         HashSet<Book> set = new HashSet<Book>();  
		 
         Book book1 = new Book(1, "Computer Programming", "Naz Ahmed", "Naztech", 100);
         Book book2 = new Book(2,"Let us C","Yashwant Kanetkar","BPB",80);
         
         
         set.add(book1);
         set.add(book2);
         
         for(Book abook:set)
         {  
        	    System.out.println(abook.getId()+" "+abook.getName()+" "+abook.getAuthor()+" "+abook.getPublisher()+" "+abook.getQuantity());  
        	    
         }  
         
		 

	}

}
