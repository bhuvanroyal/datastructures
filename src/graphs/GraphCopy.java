package graphs;

import java.util.*;

public class GraphCopy {
	
	Node root;
	
	class Node{
		int val;
		List<Node> neighbors;
		Node(int val){
			this.val=val;
			this.neighbors=new ArrayList<>();
		}
	}
	
	public void iterateGraph(Node root) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Set<Integer> visited=new HashSet<>();
		visited.add(root.val);
		Node resNode=new Node(root.val);
		while(!queue.isEmpty()) {
			Node temp=queue.remove();
			if(temp.val!=root.val) {
				Node newNode=new Node(temp.val);
				newNode.neighbors=temp.neighbors;
			}
			System.out.println(temp.val);
			for(Node n:temp.neighbors) {
				if(!visited.contains(n.val)) {
					visited.add(n.val);
					queue.add(n);
				}
			}
		}
	}
	
	public Node createGraph(int val) {
		Node newNode=new Node(val);
		Node newNode2=new Node(2);
		newNode2.neighbors.add(newNode);
		newNode.neighbors.add(newNode2);
		Node newNode3=new Node(3);
		newNode.neighbors.add(newNode3);
		newNode3.neighbors.add(newNode);
		Node newNode4=new Node(4);
		newNode2.neighbors.add(newNode4);
		newNode4.neighbors.add(newNode2);
		newNode4.neighbors.add(newNode3);
		newNode3.neighbors.add(newNode4);
		root=newNode;
		return root;
	}
	
	public static void main(String[] args) {
		
		GraphCopy gc=new GraphCopy();
//		System.out.println();
		gc.iterateGraph(gc.createGraph(1));
		
		
		
		
		
		
	}

}
