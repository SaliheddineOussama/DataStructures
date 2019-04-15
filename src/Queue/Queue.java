package Queue;

public class Queue<T> implements List<T> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int counter;

	@Override
	public void enqueue(T data) {
		++this.counter;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextValue(null);
		if(this.firstNode == null) this.firstNode = this.lastNode;
		else{
			oldLastNode.setNextValue(this.lastNode);
		}
	}

	@Override
	public T dequeue() {
		--this.counter;
		T dataToBeRemoved = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextValue();
		return dataToBeRemoved;
	}

	@Override
	public T peek() {
		return this.firstNode.getData();
	}

	@Override
	public void printQueue() {
		Node<T> nodes = this.firstNode;
		
		while(nodes != null){
			System.out.print(nodes + " ");
			nodes = nodes.getNextValue();
		}
		System.out.print("#endOfQueue");
		System.out.println();
	}

	@Override
	public int countElement() {
		return this.counter;
	}

}
