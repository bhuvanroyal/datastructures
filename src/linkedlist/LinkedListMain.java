package linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
	
		LinkedList list=new LinkedList();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(2);
		list.append(2);
		list.append(5);
		
//		list.append(6);
//		list.prepend(22);
//		System.out.println(list.findMiddleNode().value);
//		list.set(0, 10);
//		list.insert(2, 25);
//		list.removeLast();
//		list.removeFirst();
//		System.out.println(list.get(1).value);
//		list.remove(1);
//		list.prepend(13);
//		list.reverse();
		list.removeDuplicates();
		list.reverseBetween(2, 4);
		list.printList();
//		System.out.println(list.remove(3).value);
//		list.insert(3, 30);
//		list.removeFirst();
//		list.reverse();
//		list.partitionReverse(0, 1);
//		list.printList();
//		System.out.println(list.getNodeByIndex(3).value);

	}

}
