package katas;

import java.util.Arrays;
//AreTheyTheSameSolution
import java.util.List;

public class AreTheyTheSameSolution {
	
	public boolean firstSolution(int[] a, int[] b) {

		if (a == null || b == null) return false;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int) Math.pow(a[i], 2);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (Arrays.equals(a, b)) return true;
		
		return false;
	}
	
	public static void main (String [] args) {
		int[] first = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] second= new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		
		AreTheyTheSameSolution kata = new AreTheyTheSameSolution();
		
		System.out.println("Valor => " + kata.firstSolution(first, second));
	}
	
}
