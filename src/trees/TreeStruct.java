package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class TreeStruct {
	
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	public void iterativePostOrder(Node rootNode) {
		Stack<Node> stack=new Stack<>();
		ArrayList<Integer> postOrder=new ArrayList<>();
		while(rootNode!=null || !stack.isEmpty()) {
			if(rootNode!=null) {
				stack.push(rootNode);
				rootNode=rootNode.left;
			}
			if(rootNode==null) {
				Node temp=stack.peek().right;
				if(temp==null) {
					temp=stack.pop();
					postOrder.add(temp.data);
					while(!stack.isEmpty() && stack.peek().right==temp) {
						temp=stack.pop();
						postOrder.add(temp.data);
					}
					
				}
				else {
					rootNode=temp;
				}
				
			}
		}
		System.out.println(postOrder);
		
	}
	
	public void iterativeInorder(Node rootNode) {
		Stack<Node> stack=new Stack<>();
		ArrayList<Integer> inOrder=new ArrayList<>();
		while(rootNode!=null || !stack.isEmpty()) {
			if(rootNode!=null) {
				stack.push(rootNode);
				rootNode=rootNode.left;
			}
			if(rootNode ==null){
				Node temp=stack.pop();
				inOrder.add(temp.data);
				if(temp.right!=null) {
					rootNode=temp.right;
				}
				
			}
		}
		System.out.println(inOrder);
		
	}
	
	public void iterativePreOrder(Node rootNode){
		
		Stack<Node> stack=new Stack<>();
		ArrayList<Integer> preOrder=new ArrayList<>();
		stack.push(rootNode);
		while(!stack.isEmpty()) {
			Node temp=stack.pop();
			preOrder.add(temp.data);
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
		System.out.println(preOrder);	
	}
	
	
	public void iterativePreOrder2(Node rootNode){
		
		Stack<Node> stack=new Stack<>();
		ArrayList<Integer> preOrder=new ArrayList<>();
		while(rootNode!=null || !stack.isEmpty()) {
			if(rootNode!=null){
				preOrder.add(rootNode.data);
				stack.push(rootNode);
				rootNode=rootNode.left;
			}
			else {
				rootNode=stack.pop().right;
			}
		}
		System.out.println(preOrder);	
	}
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(root==null) {
			root=newNode;
		}
		else {
			
			Node temp=root;
			Queue<Node> queue=new LinkedList<>();
			queue.add(temp);
			while(!queue.isEmpty()) {
				temp=queue.remove();
				if(temp.left!=null && temp.right==null){
					temp.right=newNode;
					break;
					
				}
				else if(temp.left==null && temp.right!=null) {
					temp.left=newNode;
					break;
//					queue.add(temp.right);
				}
				else if(temp.left!=null && temp.right!=null) {
					queue.add(temp.left);
					queue.add(temp.right);
				}
				else{
					temp.left=newNode;
					break;
				}
			}
		}
		
	}
	
	public void printBFS() {
		Node temp=root;
		Queue<Node> queue=new LinkedList<>();
		queue.add(temp);
		while(!queue.isEmpty()) {
			temp=queue.remove();
			System.out.print(temp.data +" ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		
	}
	
	public void preOrder(Node temp) {
		
		if(temp==null) {
			return;
		}
		System.out.print(temp.data +" ");
		preOrder(temp.left);
		preOrder(temp.right);
	}
	
	public void postOrder(Node temp) {
		
		if(temp==null) {
			return;
		}
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.print(temp.data +" ");
	}

	public void inOrder(Node temp) {
	
	if(temp==null) {
		return;
	}
	inOrder(temp.left);
	System.out.print(temp.data +" ");
	inOrder(temp.right);
}
	
	public void constructTree() {
		root.left=new Node(5);
		root.right=new Node(1);
		root.left.left=new Node(3);
		root.left.right=new Node(2);
//		root.left.right.left=new Node(8);
		root.right.left=new Node(6);
//		root.right.right=new Node(7);
//		root.right.left.right=new Node(9);
//		root.right.left.right.right=new Node(10);
		
	}
	

	public static void main(String[] args) {
		TreeStruct tree = new TreeStruct();
		
		tree.insert(4);
		tree.constructTree();
//		tree.insert(2);
//		tree.insert(3);
//		tree.insert(4);
//		tree.insert(5);
//		tree.insert(6);
//		tree.insert(7);
		
		
//		tree.printBFS();
		System.out.println("preOrder");
		tree.preOrder(tree.root);
		System.out.println("postOrder");
		tree.postOrder(tree.root);
		System.out.println("inOrder");
		tree.inOrder(tree.root);
		
//		tree.iterativePreOrder2(tree.root);
//		tree.iterativeInorder(tree.root);
//		tree.iterativePostOrder(tree.root);
//		
		
		

	}

}
