package Stack;

public interface List<T> {

	public void push(T data);
	public T pop();
	public T peek();
	public void printStack();
	public int countElement();
}
