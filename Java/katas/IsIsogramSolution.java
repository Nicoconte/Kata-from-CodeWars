package katas;

import java.util.*;

public class IsIsogramSolution {

	public boolean firstSolution(String word) {
		boolean isIsogram = true;
		
		word = word.toLowerCase();		
		
		int index = 0;
		
		for(int i = 0; i < word.length(); i++) {
			index = word.indexOf(word.charAt(i));
			for(int j = 0; j < word.length(); j++) {
				if (index != j && word.charAt(index) == word.charAt(j)) {
					isIsogram = false;
				}
			}
		}
		
		return isIsogram;
	}
	
	public boolean secondSolution(String word) {
		boolean isIsogram = true;
		
		List<String> chars = new ArrayList<>();
		
		word = word.toLowerCase();
		
		for(int i = 0; i < word.length(); i++) {
			if (chars.contains(String.valueOf(word.charAt(i)))) {
				isIsogram = false;
				break;
			} 	
			chars.add(String.valueOf(word.charAt(i)));
		}
		
		return isIsogram;
	}
	
	public boolean thirdSolution(String word) {
		return word.toLowerCase().chars().distinct().count() == word.length();
	}
	
	public static void main(String [] args) {

		String wordToTest = "Dermatoglyphics";
		
		IsIsogramSolution solution = new IsIsogramSolution();
		
		System.out.println("Primera solucion => " + solution.firstSolution(wordToTest));
		System.out.println("Segunda solucion => " + solution.secondSolution(wordToTest));
		System.out.println("Tercera solucion => " + solution.thirdSolution(wordToTest));
		
		
	}
	
}
