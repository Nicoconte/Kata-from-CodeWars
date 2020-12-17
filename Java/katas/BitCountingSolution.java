package katas;

import static utils.Utils.*;

public class BitCountingSolution {
	/*
	 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. 
	 * You can guarantee that input is non-negative.
	 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
	 * */	
	
	public int firstSolution(int input) {
		String binary = Integer.toBinaryString(input);
		int total = 0;

		for(int i = 0; i < binary.length(); i++) {
			total += Integer.parseInt(charToString(binary.charAt(i)));
		}
		
		return total;
	}
	
	public int secondSolution(int input) {
		return Integer.bitCount(input);
	}
	
	public static void main(String [] args) {
		BitCountingSolution kata = new BitCountingSolution();
		print(testing(kata.firstSolution(1234), 5));
	}
}
