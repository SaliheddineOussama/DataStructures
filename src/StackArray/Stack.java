package StackArray;

public class Stack<T> {

	private T[] stack;
	private int counter;
	
	public Stack(){
		this.stack = (T[]) new Object[1];
	}

	public void push(T data){
		if(this.stack.length == this.counter){
			resizeArray(this.stack.length+1);
		}
		this.stack[counter++] = data;
	}

	// O(N) ==> Linear Time Complexity !!! :(
	private void resizeArray(int capacity) {
		T[] copieArray = (T[]) new Object[capacity];
		for(int i=0; i<this.counter; i++)
			copieArray[i]=this.stack[i];
		this.stack = copieArray;
		copieArray = null;
	}
	
	public void printStack(){
		for(int i=this.stack.length-1; i>=0; --i){
			System.out.print(this.stack[i] + " ");
		}
		System.out.println("#EndOfStack");
	}
	
	public T pop(){
		T dataToBeRemoved = this.stack[--this.counter];
		resizeArray(this.stack.length-1);
		return dataToBeRemoved;
	}
	
	public int countElement(){
		return this.counter;
	}
}
