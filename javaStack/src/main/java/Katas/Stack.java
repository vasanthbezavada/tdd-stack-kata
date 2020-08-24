package Katas;

public class Stack {

	public String[] stringStack ;
	public int currentIndex;
	public int size;
	
	public Stack(int size) {
		this.size=size;
		this.stringStack= new String[size];
		this.currentIndex=0;
	}
	
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
