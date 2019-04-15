package Queue;

public interface List<T> {

	public void enqueue(T data);
	public T dequeue();
	public T peek();
	public void printQueue();
	public int countElement();
}
