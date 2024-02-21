package recursion;

public class LinkedList {
	Node head;
	public class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	
	public static Node sum(Node l1,Node l2) {
		if(l1==null && l2==null) {
			return l1;
		}
		sum(l1.next,l2.next);
		l1.val+=l2.val;
		return l1;
	}

	public static void main(StringPermutation[] args) {
		
		LinkedList l=new LinkedList();
		l.head=l.new Node(1);
		l.head.next=l.new Node(2);
		l.head.next.next=l.new Node(3);
		
		LinkedList l2=new LinkedList();
		l2.head=l2.new Node(4);
		l2.head.next=l2.new Node(5);
		l2.head.next.next=l2.new Node(6);
		
		System.out.println(sum(l.head,l2.head).val);
		
		
		
	}

}
