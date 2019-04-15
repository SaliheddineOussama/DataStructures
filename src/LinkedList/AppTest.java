package LinkedList;

public class AppTest {

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<Integer>();
		
		myList.add(3);
		myList.add(14);
		myList.add(-5);
		myList.add(34);
		
		myList.printList();
		System.out.println("The number of element in my list is : " + myList.countElement());
		
		myList.remove(14);
		myList.printList();
		System.out.println("The number of element in my list is : " + myList.countElement());
	}

}
