package assignment_7;


import java.util.*;
import java.util.Map.Entry;

public class ScoreCard {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>(); 
		Scanner sc=new Scanner(System.in);
		int total=0;
		System.out.println("enter number of batsmen : ");
		int n=sc.nextInt();
		System.out.println("Enter Runs Scored");
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			
			int run=sc.nextInt();
			m.put(run,name);
			total+=run;
			
			
		}
		//int max= Collections.max(m.keySet()); 
		
		System.out.println("Players who batted ");
		for(Map.Entry map:m.entrySet()) {
            System.out.println(map.getKey()+" - "+map.getValue());
        }
		System.out.println("Total Score : "+total);
		//System.out.println("Name of Highest Scorer : " +m.get(max));
		
		
	
		
	}

}
