package assignment4;

import java.util.Scanner;

public class BookDetails {
	public static void main(String args[])
	{
		Book b=new Book();
		EngineeringBook engb= new EngineeringBook();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of books ");
		int nb=sc.nextInt();
		b.setBookNo(nb);
		System.out.print("Enter book title ");
		String title=sc.next();
		b.setTitle(title);
		System.out.print("Enter author ");
		String author=sc.next();
		
		b.setAuthor(author);
		System.out.print("Enter price ");
		float price=sc.nextFloat();
		b.setPrice(price);
		System.out.print("Enter category ");
		String category =sc.next();
		engb.setCategory(category);
		
		System.out.println("Book No : "+ b.getBookNo());
		System.out.println("Title : "+ b.getTitle());
		System.out.println("Author : "+ b.getAuthor());
		System.out.println("Book category : "+ engb.getCategory());
		System.out.println("Price : "+ b.getPrice());		
		
		sc.close();
		
		
		
	}

}
