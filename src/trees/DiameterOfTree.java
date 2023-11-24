package trees;

import trees.Tree.Node;

public class DiameterOfTree {
	
	public static int diameter(Node root, int[] max) {
		if(root==null) {
			return 0;
		}
		int left=diameter(root.left,max);
		int right=diameter(root.right,max);
		max[0]=Math.max(left+right,max[0]);
		return Math.max(left,right)+1;
		
	}

	public static void main(String[] args) {
		
		int[] max=new int[1];
		max[0]=0;
		Tree tree=new Tree();
		tree.root=tree.new Node(1);
		tree.root.left=tree.new Node(2);
		tree.root.right=tree.new Node(3);
		tree.root.left.left=tree.new Node(4);
		tree.root.left.right=tree.new Node(5);
		tree.root.left.left.left=tree.new Node(6);
		tree.root.left.left.right=tree.new Node(7);
		diameter(tree.root,max);
		System.out.println(max[05]);
		
	}

}
