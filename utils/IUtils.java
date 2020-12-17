package utils;

public interface IUtils {
	
	/*
	 * @task: compare two entry objects. This will be used to test input and output from code wars challenges
	 * @param generic Object "actual", generic Object "expected"
	 * @return boolean. True if this two object match, otherwise it return false
	 * */
	static boolean testing(Object actual, Object expected) { return false; }
	
	
	/*
	 * @task: simplify message display
	 * @param generic Object. It could be a String, an Integer, etc
	 * */
	static void print(Object object) {}
	
	/*
	 * @task: simplify char conversion
	 * @param char c
	 * @return String
	 * */
	static String charToString(char c) { return ""; }
	
	/*
	 * @task: get char as string at the given index
	 * @param String, index
	 * @return single char as String
	 * */
	static String getCharAsStr(String str, int i) { return ""; }
	
	static int min(int [] arr) { return -1; }
}