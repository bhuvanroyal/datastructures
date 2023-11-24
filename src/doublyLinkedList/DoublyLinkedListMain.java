package doublyLinkedList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.append(1);
		dll.append(2);
		dll.append(3);
//		dll.reverse();
		
//		dll.append(4);
//		dll.append(5);
		dll.reversePairs();
		dll.printList();
	}

}
