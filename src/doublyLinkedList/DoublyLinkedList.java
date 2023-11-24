package doublyLinkedList;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public class Node{
		int value;
		Node next;
		Node prev;
		Node(int value){
			this.value=value;
		}
	}
	
	public void append(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		length+=1;
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void reverse() {
		Node first=head;
		while(head!=null) {
			Node temp=head.prev;
			head.prev=head.next;
			head.next=temp;
			head=head.prev;
		}
		head=tail;
		tail=first;
	}
	
	public void reversePairs() {
		Node current=head;
		head=current.next;
		Node temp=null;
		while(current!=null && current.next!=null) {
			Node fnode=current;
			Node snode=current.next;
			Node after=snode.next;
			fnode.next=after;
			fnode.prev=snode;
			snode.prev=temp;
			snode.next=fnode;
			if(temp!=null) {
				temp.next=snode;
			}
			temp=fnode;
			current=after;
		}
		
	}
	
}
