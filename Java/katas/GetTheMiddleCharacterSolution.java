package katas;

import static utils.Utils.*;

public class GetTheMiddleCharacterSolution {
	
	public String firstSolution(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		if (word.length() % 2 == 0) {
			word = word.substring(0, word.length() / 2 + 1);
			sb.append( String.valueOf(word.charAt(word.length() - 2)) );
			sb.append( String.valueOf(word.charAt(word.length() - 1)) );
			
		} else {
			word = word.substring(0, (word.length() / 2 + 1));
			sb.append( String.valueOf(word.charAt(word.length() - 1)) );			
		}
		
		return sb.toString();
	}
	
	public String secondSolution(String word) {
		StringBuilder sb = new StringBuilder();
		
		if (word.length() % 2 == 0) {
			sb.append( word.charAt(word.length() / 2) );
			sb.append( word.charAt(word.length() / 2 - 1) );
		} else {
			sb.append( word.charAt(word.length() / 2) );
		}
		
		return sb.toString();
	}
	
	public String thirdSolution(String word) {
		String output = "";
		
		if (word.length() % 2 == 0) {
			output = charToString(word.charAt(word.length() / 2)).concat(charToString(word.charAt(word.length() / 2 - 1)));
		} else {
			output = String.valueOf(word.charAt(word.length() / 2));
		}
		
		return output;
	}
	
	public static void main(String [] args) {
		GetTheMiddleCharacterSolution kata = new GetTheMiddleCharacterSolution();
		
		print(kata.thirdSolution("middle"));
		
		print(testing(kata.thirdSolution("middle"), "dd"));
	}
	
}
