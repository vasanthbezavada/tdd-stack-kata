package Katas;
// STATIC STACK
public class Stack {

	public static final int SIZE = 10;
	public static int currentIndex=0;
	public static String[] stringStack = new String[SIZE];


	public static void push(String element) throws Exception {
		if(element== null)
			throw new Exception();
		else {
		stringStack[currentIndex]=element;
		currentIndex++;
		}
	}
	
	public static String pop() {
		if (currentIndex==0) {
			return null;
		}
		else {
		String picked = stringStack[currentIndex-1];
		stringStack[currentIndex-1]=null;
		currentIndex--;
		return picked;
		}
	}
}
