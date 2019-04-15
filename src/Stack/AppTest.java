package Stack;

public class AppTest {

	public static void main(String[] args) {
		List<Integer> myStack = new Stack<Integer>();
		
		myStack.push(4);
		myStack.push(68);
		myStack.push(-78);
		myStack.push(48);
		myStack.push(77);
		
		myStack.printStack();
		myStack.pop();
		System.out.println("The stack elements after pop operation !!");
		myStack.printStack();
		myStack.pop();
		System.out.println("The stack elements after pop operation (2) !!");
		myStack.printStack();
	}

}
