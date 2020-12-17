package katas;

import static utils.Utils.*;

import java.util.Arrays;

public class MaximumSubarraySumSolution {
	
	public boolean areNegative(int [] arr) {		
		return Arrays.stream(arr).filter(i -> i < 0).count() == arr.length;
	}
	
	public int firstSolution(int [] arr) {
		
		if (arr.length == 0) return 0; // This is a condition from kata´s challenge. If it null, it should return 0
		 
		if (areNegative(arr)) return 0; // And if all elements from the array are negative, it should return 0 too
		
		int maxSoFar = Integer.MIN_VALUE;
		int maxEnding = 0;
		
		for(int i = 0; i < arr.length; i++) {
			maxEnding = maxEnding + arr[i];
			
			if (maxSoFar < maxEnding)
				maxSoFar = maxEnding;
			if (maxEnding < 0)
				maxEnding = 0;
		}
		
		return maxSoFar;
	}
	
	
	public int secondSolution(int [] arr) {
		int sum = 0;
		int max = 0;
		
		for (int i : arr) {
			sum += i;
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}
		
		return max;
	}
	
	public static void main(String [] args) {
		MaximumSubarraySumSolution kata = new MaximumSubarraySumSolution();
		
		print(testing(kata.firstSolution(new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4 }), 6));
		print(testing(kata.firstSolution(new int[]{}), 0));
		print(testing(kata.firstSolution(new int[]{ -2, -1, -3, -4, -1, -2, -1, -5, -4 }), 0));
		
		print(testing(kata.secondSolution(new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4 }), 6));
		print(testing(kata.secondSolution(new int[]{}), 0));		
		
	}
	
}
