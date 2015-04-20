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
		
		for (int i = 1; i < 10; i++) { 
			System.out.println("test");
			input = s.nextLine(); 
			
			String temp[] = input.split(" "); 
			                                  
			
			data = Integer.parseInt(temp[1], 2); 
												 
			
			if (temp[0].length() == 3) { 
				teamA.add(data);		 
			} else {                     
				teamB.add(data);         
			}
		}
		
		System.out.println("Month " + month + ":");
		
		for (int i = 0; i < teamA.size(); i++) {
			System.out.print(teamA.get(i));
			teamATotal += teamA.get(i);
		}
		
		for (int i = 0; i < teamB.size(); i++) {
			System.out.print(teamB.get(i));
			teamBTotal += teamB.get(i);
		}
		
		System.out.println(teamATotal + " " + teamBTotal);
		
		if (teamATotal > teamBTotal) {
			System.out.println("Team A sold more than Team B");
		} else {
			System.out.println("Team B sold more than Team A");
		}
		
		

	}

}
