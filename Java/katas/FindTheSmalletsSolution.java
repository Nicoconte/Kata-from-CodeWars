package katas;

import static utils.Utils.*;

public class FindTheSmalletsSolution {
	
	public int firstSolution(long numbers) {
		int min = (int) String.valueOf(numbers).charAt(0);
		
		for ( Character s : String.valueOf(numbers).toCharArray() ) {
			min = Math.min(Integer.parseInt( s.toString() ), min);
		}
		
		return min;
	}
	
	
	public static void main(String [] args) {
		FindTheSmalletsSolution kata = new FindTheSmalletsSolution();
		
		print(testing(kata.firstSolution(209917), 0));

	}
	
}
