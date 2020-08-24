package Katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void pushAndPop_SingleItem() throws Exception {
		Stack stack = new Stack();
		stack.push("vasanth");
		assertEquals("vasanth", stack.pop());		
	}
	@Test
	public void pushAndPop_MultipleItems() throws Exception {
		Stack stack = new Stack();
		stack.push("vasanth");
		stack.push("kumar");
		assertEquals("kumar",stack.pop());
		assertEquals("vasanth", stack.pop());			
	}
	@Test
	public void pop_EmptyStack() {
		Stack Stack = new Stack();
		assertEquals(null,Stack.pop());
	}
	@Test
	public void push_Null() {
		Stack stack = new Stack();
		assertThrows(Exception.class,()-> stack.push(null));
	}

}
