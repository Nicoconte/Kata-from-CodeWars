package katas;

import static utils.Utils.*;

import java.util.Arrays;

public class ConvertStringToCamelCaseSolution {
	
	public String firstSolution(String str) {		
		StringBuffer sb = new StringBuffer();
		boolean flipToUpper = false;
		
		for(char c : str.toCharArray()) {
			if (c == '_' || c == '-') {
				flipToUpper = true;
			} else {
				sb.append( (flipToUpper) ? Character.toUpperCase(c) : c );
				flipToUpper = false;
			}
		}
		return sb.toString();
	}
	
	public static void main(String [] args) {
		ConvertStringToCamelCaseSolution kata = new ConvertStringToCamelCaseSolution();
		
		print(kata.firstSolution("the-stealth-warrior"));
		
	}
	
}
