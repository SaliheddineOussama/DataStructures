package StackArray;

public class AppTest {

	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<Integer>();
		
		myStack.push(4);
		myStack.push(47);
		myStack.push(53);
		myStack.push(-89);
		myStack.push(256);
		
		System.out.println("The number of element in the stack is : " + myStack.countElement());
		myStack.printStack();
		
		System.out.println("The element which get removed is : " + myStack.pop());
		System.out.println("The number of element in the stack after the pop operation is : " + myStack.countElement());
		myStack.printStack();
		
	}

}
