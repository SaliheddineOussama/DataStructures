package Queue;

public class Node<T> {

	private T data;
	private Node<T> nextValue;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextValue() {
		return nextValue;
	}
	public void setNextValue(Node<T> nextValue) {
		this.nextValue = nextValue;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
}
