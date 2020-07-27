package assignment_6;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		try{
			
			System.out.println("Enter customer  details :");
			System.out.print("customer number : ");
			String cno = scan.next();
			System.out.print("customer Name : ");
			String cname = scan.next();
			System.out.print("Category : ");
			String s= scan.next();
			String category=s.toUpperCase();
			scan.close();
			
			Customer cust = new Customer(cno,cname,category);
		
			cust.validate(cno,cname,category);
		
			System.out.println("Customer ID : " + cust.getCustNo());
			System.out.println("Customer Name : " + cust.getCustName());
			System.out.println("Category : " + cust.getCategory());
		}
		catch(InvalidInputException i) {
			System.out.println(i.getMessage());
		}
	}
	}
