package assignment_7;


import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData = new LinkedList<Integer>();
	ScoreAnalyzer(LinkedList<Integer> runsData)
	{
		super();
		this.runsData =runsData;
	}
	public ScoreAnalyzer() {
		// TODO Auto-generated constructor stub
	}
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	double calcRunRate()
	{ 
		double runrate=0;
	for(int i=0;i<runsData.size();i++)
	{
		runrate=runrate+runsData.get(i);
	}
	return (runrate/50);
	}
	 int  lowestRunsScored()
	 {
		 Collections.sort(runsData); 
		 return runsData.get(0);
		 
	 }
	void displayRuns()
	{
		System.out.print("Runs Scored : ");
		for(int i: runsData)
		{
			System.out.print((runsData.indexOf(i)+1) + " - "+i +  "	");
		}
	}
	
	

}
