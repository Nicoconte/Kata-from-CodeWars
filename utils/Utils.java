package utils;

public class Utils implements IUtils {
	/*
	 * Static implementation of IUtils Interface
	 * */
	
	//In this case we compare the object type and content
	public static boolean testing(Object actual, Object expected) {
		return actual.equals(expected);
	}
	
	
	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static String charToString(char c) {
		return String.valueOf(c);
	}
	
	public static String getCharAsStr(String str, int index) {
		return String.valueOf(str.charAt(index));
	}
	
	public static int min(int arr[]) {
		int m = arr[0];
		
		for (int i : arr) {
			m = Math.min(i, m);
		}
		
		return m;
	}
	
	
}
