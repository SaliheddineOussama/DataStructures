package DoublyLinkedList;

public class AppTest {

	public static void main(String[] args) {
		List<Integer> myDoublyList = new DoublyLinkedList<Integer>();
		
		myDoublyList.add(3);
		myDoublyList.add(45);
		myDoublyList.add(-43);
		myDoublyList.add(289);
		System.out.println("The number of elements in my doubly linked list is : " + myDoublyList.countElement());
		
		myDoublyList.printList();
		myDoublyList.remove(45);
		myDoublyList.printList();
		myDoublyList.remove(289);
		myDoublyList.printList();
		myDoublyList.remove(-43);
		myDoublyList.printList();
		myDoublyList.remove(3);
		myDoublyList.printList();
		System.out.println("The number of elements in my doubly linked list after removing all items is : " + myDoublyList.countElement());
	}

}
