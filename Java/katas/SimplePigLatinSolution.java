package katas;

import static utils.Utils.*;

public class SimplePigLatinSolution {
	/*
	 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
	 * */
	
	public String firstSolution(String str) {
		String firstChar;
		StringBuilder sb = new StringBuilder();
		
		String [] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			print(String.valueOf(arr[i].charAt(0)));
			
			if (!String.valueOf(arr[i].charAt(0)).equals("!")) {
				firstChar = String.valueOf(arr[i].charAt(0));
				sb.append(arr[i].substring(1, arr[i].length()));
				sb.append(firstChar);
				sb.append("ay");
				sb.append(" ");
			} else {
				sb.append("!");
				sb.append(" ");
			}
		}
	
		return sb.toString().substring(0, sb.length() - 1);
	}
	
	
	public static void main(String [] args) {
		SimplePigLatinSolution kata = new SimplePigLatinSolution();
		
		print(kata.firstSolution("This is my string !"));
		
		print(kata.firstSolution("Pig latin is cool") + "\n" + "igPay atinlay siay oolcay");
		
		print(testing(kata.firstSolution("Pig latin is cool"), "igPay atinlay siay oolcay"));
	}
}
