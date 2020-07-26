package assignment_7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class StudentMarks {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		float avg=0;
		System.out.print("Enter number of students ");
		int n =sc.nextInt();
		System.out.println("enter marks ");
		for(int i=1;i<=n;i++)
		{
			int mark=sc.nextInt();
			list.add(mark);	
			avg=avg+mark;
		}
		sc.close();		
		
		int higest=list.get(n-1);
		
		
		System.out.println("Highest Marks :"+higest);
		System.out.println("Average Marks : "+avg/n);
		System.out.print("Marks : ");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+"-"+list.get(i)+" ");
		}
		System.out.println();
		System.out.println("3rd Student marks : "+list.get(2));

		Collections.sort(list);
		System.out.print("Sorted : ");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+"-"+list.get(i)+" ");
		}
		
	}

}
