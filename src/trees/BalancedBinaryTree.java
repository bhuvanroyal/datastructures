package trees;

import trees.Tree.Node;

public class BalancedBinaryTree {
	
	public static int checkBalanced(Node root) {
		if(root==null) {
			return 0;
		}
		int left=checkBalanced(root.left);
		if(left==-1) {
			return -1;
		}
		int right=checkBalanced(root.right);
		if(right==-1) {
			return -1;
		}
		if(Math.abs(left-right)>1) {
			return -1;
		}
		return Math.max(left, right)+1;
	}

	public static void main(String[] args) {
		
		Tree tree=new Tree();
		tree.root=tree.new Node(1);
		tree.root.left=tree.new Node(2);
		tree.root.right=tree.new Node(3);
		tree.root.left.left=tree.new Node(4);
		tree.root.left.right=tree.new Node(5);
//		tree.root.left.left.left=tree.new Node(6);
//		tree.root.left.left.right=tree.new Node(7);
		System.out.println(checkBalanced(tree.root));
		
		
	}

}
