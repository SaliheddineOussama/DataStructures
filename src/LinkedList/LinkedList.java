package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int counter;

	@Override
	public void add(T data) {
		++this.counter;
		if(this.root == null) this.root = new Node<T>(data);
		else{
			insertAtBeginning(data);
		}
	}

	private void insertAtBeginning(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}
	
	private void insertAtTheEnd(T data, Node<T> node){
		if(node.getNextNode() != null){
			node = node.getNextNode();
			insertAtTheEnd(data, node);
		}
		else{
			Node<T> newNode = new Node<T>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if(this.root == null) return;
		if(this.root.getData().compareTo(data)==0){
			--this.counter;
			this.root = this.root.getNextNode();
		}
		else{
			--this.counter;
			removeNode(data, this.root, this.root.getNextNode());
		}
	}

	private void removeNode(T data, Node<T> previous, Node<T> actual) {
		while(actual != null){
			if(actual.getData().compareTo(data)==0){
				previous.setNextNode(actual.getNextNode());
				actual = null;
				return;
			}
			
			previous = actual;
			actual = actual.getNextNode();
		}
	}

	@Override
	public void printList() {
		if(this.root == null) return;
		Node<T> nodes = this.root;
		
		while(nodes != null){
			System.out.print(nodes + " -> ");
			nodes = nodes.getNextNode();
		}
		System.out.print("null");
		System.out.println();
	}

	@Override
	public int countElement() {
		return this.counter;
	}

}
