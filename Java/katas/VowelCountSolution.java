package katas;

import static utils.Utils.*;

public class VowelCountSolution {
	
	public int firstSolution(String str) {
		int vowels = 0;
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'a': vowels++; break;
				case 'e': vowels++; break;
				case 'u': vowels++; break;
				case 'i': vowels++; break;
				case 'o': vowels++; break;
				default: break;
			}
		}
		
		return vowels;
	}
	
	public int secondSolution(String str) {
		return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	}
	
	public static void main(String [] args) {
		VowelCountSolution kata = new VowelCountSolution();
		print(testing(kata.secondSolution("aeioucls"), 5));
	}
}
