package Katas;
// STATIC STACK
public class Stack {

	public static final int SIZE = 10;
	public static int currentIndex=0;
	public static String[] stringStack = new String[SIZE];


	public void push(String element) throws Exception {
		if(element== null)
			throw new Exception();
		else {
		stringStack[this.currentIndex]=element;
		this.currentIndex++;	
		}
	}
	
	public String pop() {
		if (this.currentIndex==0) {
			return null;
		}
		else {
		String picked = stringStack[this.currentIndex-1];
		stringStack[this.currentIndex-1]=null;
		this.currentIndex--;
		return picked;
		}
	}

	public static void main(String[] args) {

	}
}
