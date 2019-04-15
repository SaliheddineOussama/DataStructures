package LinkedList;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> nextNode;
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
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	
	
}