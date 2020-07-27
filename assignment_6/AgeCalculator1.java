package assignment_6;


import java.util.Scanner;

public class AgeCalculator1 {
	static int calculateAge(String str)
	{
		String st=str.replace('-', '/');
		
		String s[]=st.split("/");
		int d[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			d[i]=Integer.parseInt(s[i]);  
			
		}
		
		return 2020 - d[2];
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter DOB");
			String dob = scan.next();
			scan.close();
			 
			try {
				if(dob.matches("\\d{2}/\\d{2}/\\d{4}"))
					System.out.println("Age : " + calculateAge(dob));
				else
					throw new MyException("Date of Birth should be in dd/mm/yyyy format");
			}
			catch(MyException me) {
				System.out.println(me);
			}
		}
	}
		
	


