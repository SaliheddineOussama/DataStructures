package DoublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> implements List<T>{
	
	private Node<T> root;
	private int counter;
	
	@Override
	public void add(T data) {
		++this.counter;
		if(this.root == null) {
			this.root = new Node<T>(data);
			this.root.setPrevious(null);
			this.root.setNext(null);
		}
		else{
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(this.root);
			this.root.setPrevious(newNode);
			this.root = newNode;
		}
	}
	@Override
	public void remove(T data) {
		if(this.root == null) return;
		if(this.root.getData().compareTo(data) == 0){
			--this.counter;
			this.root = this.root.getNext();
		}
		else{
			--this.counter;
			removeNode(data, this.root);
		}
	}
	private void removeNode(T data, Node<T> node) {
		while(node != null){
			if(node.getData().compareTo(data) == 0){
					node.getPrevious().setNext(node.getNext());
					node.getNext().setPrevious(node.getPrevious());	
					return;
			}
			node = node.getNext();
		}
	}
	@Override
	public void printList() {
		Node<T> nodes = this.root;
		while(nodes != null){
			System.out.print(nodes + " <-> ");
			nodes = nodes.getNext();
		}
		System.out.print("null");
		System.out.println();
	}
	@Override
	public int countElement() {
		return this.counter;
	}
	
	

}
