package Stack;

/// implementing stack using linkedlist

public class Stack<T> implements List<T> {
	
	private Node<T> root;
	private int counter;

	@Override
	public void push(T data) {
		++this.counter;
		if(root == null) this.root = new Node<T>(data);
		else{
			Node<T> newNode = new Node<T>(data);
			newNode.setNextValue(this.root);
			this.root = newNode;
		}
	}

	@Override
	public T pop() {
		--this.counter;
		T nodeToBeRemoved = this.root.getData();
		this.root = this.root.getNextValue();
		return nodeToBeRemoved;
	}

	@Override
	public T peek() {
		return this.root.getData();
	}

	@Override
	public void printStack() {
		Node<T> nodes = this.root;
		
		while(nodes != null){
			System.out.println(nodes);
			nodes = nodes.getNextValue();
		}
		System.out.println();
	}

	@Override
	public int countElement() {
		return this.counter;
	}

}
