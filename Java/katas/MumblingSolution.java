package katas;

import static utils.Utils.*;

public class MumblingSolution {
	
	public String firstSolution(String s) {
	
		StringBuilder strContainer = new StringBuilder();
		int loop = 1;
		
		for (int i = 0; i < s.length(); i++) {
			strContainer.append(String.valueOf(s.charAt(i)).toUpperCase()); //Turn into Upper Case the current char
			for (int j = 0; j < loop - 1; j++) {
				strContainer.append(String.valueOf(s.charAt(i)).toLowerCase()); 
			}
			strContainer.append("-"); // Concat the "-" at the end
			loop++; // Increase the amount of loops for each char
		}
		
		return strContainer.substring(0, strContainer.length() - 1);
	}
	
	public static void main(String [] args) {
		
		MumblingSolution kata = new MumblingSolution();
		
		//Testing solution
		boolean output = testing(kata.firstSolution("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
		
		//Output
		print("Output => " + output);
		
	}
	
}
