package linkedlist;
import java.util.*;

public class ReorderList {
	Node head;
	Node tail;
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	
	public Node getHead() {
		return head;
	}
	
	public  void insert(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
		
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val +"  ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) 
	{
		ReorderList li=new ReorderList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.insert(6);
		li.insert(7);
		
		Node head=li.getHead();
		Node current=head;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        Node m=slow;
        Node after;
        while(m.next!=null){
        	after=m.next;
            m.next=after.next;
            after.next=prev.next;
            prev.next=after;
        }
        System.out.println(prev.val +"-->"+prev.next.val);
        m=prev.next;
        System.out.println(m.val);
        after=null;
        Node middle=m;
        while(true){

            after=current.next;
            current.next=m;
            middle=m.next;
            if(current==prev) {
            	break;
            }
            m.next=after;
            m=middle;
            current=after;
        }
		
        li.printList();
		
	}

}
