import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; 

public class Main { 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
		int month = Integer.parseInt(s.nextLine()); 
		//System.out.println(month);
		int data, teamATotal = 0, teamBTotal = 0; 
		
		String input; 
		
		List<Integer> teamA = new ArrayList<Integer>(); 
		List<Integer> teamB = new ArrayList<Integer>(); 
		
		//for (int i = 0; i < month * 50; i++) {
		for (int i = 0; i < 5; i++) { 
			//System.out.println("test");
			input = s.nextLine(); 
			
			String temp[] = input.split(" "); 
			                                  
			data = Integer.parseInt(temp[1], 2); 
			System.out.println(data);							 
			
			if (temp[0].length() == 3) { 
				teamA.add(data);
				System.out.println("Added to A");
			} else {                     
				teamB.add(data);         
				System.out.println("Added to B");
			}
		}
		
		System.out.println("Month " + month + ":");
		
		for (int i = 0; i < teamA.size(); i++) {
			//System.out.print(teamA.get(i));
			teamATotal += teamA.get(i);
		}
		
		for (int i = 0; i < teamB.size(); i++) {
			//System.out.print(teamB.get(i));
			teamBTotal += teamB.get(i);
		}
		
		System.out.println(teamATotal + " " + teamBTotal);
		
		if (teamATotal > teamBTotal) {
			System.out.println("Team A sold more than Team B");
		} else {
			System.out.println("Team B sold more than Team A");
		}
		
		Collections.sort(teamA);
		Collections.sort(teamB);
		
		System.out.println("The top three values for Team A are: " + teamA.get(0) + " " + teamA.get(1) + " " + teamA.get(2));
		
		System.out.println("The top three values for Team B are: " + teamB.get(0) + " " + teamB.get(1) + " " + teamB.get(2));
		

	}

}
