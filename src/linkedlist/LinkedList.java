package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	Node head;
	Node tail;
	int length;
	
	public class Node {
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}

	public void append(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
			length+=1;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			length+=1;
		}
	}
	
	public void prepend(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
			length+=1;
		}
		else {
			newNode.next=head;
			head=newNode;
			length+=1;
		}
	}
	public Node get(int index) {
		if(head==null) {
			return null;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
		
	}
	public Node remove(int index) {
		if(index>length || index<0) {
			return null;
		}
		else if(length==1) {
			head=null;
			tail=null;
			length-=1;
		}
		else {
			Node prev=get(index-1);
			Node current=prev.next;
			prev.next=current.next;
			current.next=null;
			length-=1;
			return current;
		}
		return null;
	}
	public Node removeFirst() {
		if(head==null) {
			return null;
		}
		
			Node temp=head;
			head=head.next;
			temp.next=null;
			length-=1;
			if(length==0) {
				tail=null;
			}
			return temp;
		
	}
	public Node removeLast() {
		if(head==null) {
			return null;
		}
		else {
			Node temp=head;
			Node prev=head;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			tail=prev;
			length-=1;
			if(length==0) {
				head=null;
				tail=null;
			}
			return temp;
			
		}
	}
	public boolean set(int index,int value) {
		Node temp=get(index);
		if(temp!=null) {
			temp.value=value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index,int value) {
		if(index<0 || index>length) {
			return false;
		}
		Node newNode=new Node(value);
		Node prev=get(index-1);
		Node after=prev.next;
		prev.next=newNode;
		newNode.next=after;
		return true;
		
	}
	
	public void reverse() {
		Node before=null;
		Node temp=head;
	    head=tail;
	    tail=temp;
		
		while(temp!=null) {
			Node after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
			
		}
	}
	
	public Node findMiddleNode() {
		if(head == null) {
			return null;
		}
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public boolean hasALoop() {
		if(head == null) {
			return false;
		}
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public void removeDuplicates() {
		
		Set<Integer> set=new HashSet<>();
		Node temp=head;
		Node prev=head;
		while(temp!=null) {
			if(set.contains(temp.value)) {
				prev.next=temp.next;
			}
			else {
				set.add(temp.value);
				prev=temp;
			}
			temp=temp.next;
		}
	}
	
	public void reverseBetween(int m, int n) {
		Node temp=head;
		Node dummy=new Node(0);
		dummy.next=temp;
		Node before=dummy;
		for(int i=0;i<m;i++) {
			before=temp;
			temp=temp.next;
		}
		Node current=temp;
		for(int i=0;i<n-m;i++) {
			Node after=current.next;
			current.next=after.next;
			after.next=before.next;
			before.next=after;
		}
		head=dummy.next;
	}
	
	
	
	
}
