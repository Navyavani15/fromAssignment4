package assignment4;

import java.util.Random;
import java.util.Scanner;

public class TestMedicine {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 Medicine med[]=new Medicine[5];
		 Medicine[] medicine = new Medicine[5];

			Random random = new Random();

			for (int i = 0; i <= 3; i++) {

				switch(random.nextInt(2)+1) {
				case 1:
					medicine[i] = new Tablet();
					break;
				case 2:
					medicine[i] = new Ointment();
					break;
				case 3:
					medicine[i] = new Syrup();
					
				}
				
				System.out.print("Input Expiry date : ");
				medicine[i].setExpireDate(sc.next());
				System.out.print("Enter price : ");
				medicine[i].setPrice(sc.nextDouble());
				System.out.println();
				medicine[i].getDetails();
				medicine[i].displayLabel();
			}

			sc.close();
		
	}

}
