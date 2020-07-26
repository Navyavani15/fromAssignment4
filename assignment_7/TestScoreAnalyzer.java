package assignment_7;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreAnalyzer analyzer = new ScoreAnalyzer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter of batmans : ");
		int batmans=sc.nextInt();
		System.out.print("Enter Runs");
		for(int i=0;i<batmans;i++)
		{
			analyzer.addRunsToList(sc.nextInt());
		}
		sc.close();

		System.out.println("Lowest Runs : "+analyzer.lowestRunsScored());
		System.out.println("Count of player who batted:"+batmans);
		
		
	}

}
