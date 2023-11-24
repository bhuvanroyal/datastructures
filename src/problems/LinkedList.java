package problems;

public class LinkedList {

    public Node head;
    public Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +"-->");
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void bubbleSort() {
        Node temp = head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            temp = dummy.next;
            while (temp != null && temp.next != null) {
                if (temp.value > temp.next.value) {
                    int tempValue = temp.value;
                    temp.value = temp.next.value;
                    temp.next.value = tempValue;

                    prev.next = temp.next;
                    temp.next = temp.next.next;
                    prev = temp.next;

                    swapped = true;
                }

                temp = temp.next;
            }
        }

        head = dummy.next;
    }
    
    public static void main(String[] args) 
    {
    	LinkedList ll=new LinkedList(5);
    	ll.append(3);
    	ll.append(2);
    	ll.append(1);

    	ll.bubbleSort();
    	ll.printList();
    }
    

}