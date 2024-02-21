package practice;

public class LinkedListPractice {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public boolean addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return true;
		}
		tail.next=newNode;
		tail=newNode;
		return true;
		
	}
	
	public void PrintLinkedList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"-->");
			temp=temp.next;
		}
	}
	
	public Node getTail() {
		return tail;
	}
	
	public void reverse() {
		Node temp=head;
		Node before=null;
		System.out.println();
		while(temp!=null) {
			Node after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
		head=tail;
		tail=before;
	}
	

	public static void main(String[] args) {
		
		LinkedListPractice lp=new LinkedListPractice();
		
		lp.addNode(1);
		lp.addNode(2);
		lp.addNode(3);
		lp.addNode(4);
		lp.PrintLinkedList();
		lp.reverse();
		lp.PrintLinkedList();
		System.out.println();
		System.out.println(lp.getTail().data);
		

	}

}
