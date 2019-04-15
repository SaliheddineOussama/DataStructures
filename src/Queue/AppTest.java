package Queue;

public class AppTest {

	public static void main(String[] args) {
		
		List<Integer> myQueue = new Queue<Integer>();
		
		myQueue.enqueue(4);
		myQueue.enqueue(57);
		myQueue.enqueue(14);
		myQueue.enqueue(-89);
		myQueue.enqueue(64);
		
		myQueue.printQueue();
		
		System.out.println("My Queue elements after dequeue operation (1) !!");
		myQueue.dequeue();
		myQueue.printQueue();
		
		System.out.println("My Queue elements after dequeue operation (2) !!");
		myQueue.dequeue();
		myQueue.printQueue();
	}

}
