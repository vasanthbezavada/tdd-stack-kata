package Katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void pushAndPopSingleItem() throws Exception {
		Stack stack = new Stack(5);
		stack.push("vasanth");
		assertEquals("vasanth", stack.pop());		
	}
	@Test
	public void pushAndPopMultiple() throws Exception {
		Stack stack = new Stack(5);
		stack.push("vasanth");
		stack.push("kumar");
		assertEquals("kumar",stack.pop());
		assertEquals("vasanth", stack.pop());			
	}
	@Test
	public void popEmptyStack() {
		Stack Stack = new Stack(5);
		assertEquals(null,Stack.pop());
	}
	@Test
	public void pushNull() {
		Stack stack = new Stack(10);
		assertThrows(Exception.class,()-> stack.push(null));
	}

}
