package trees;

public class MaxDepth {
	
	public static int maxDepth(Tree.Node root) {
		if(root==null) {
			return 0;
		}
		return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
		
	}

	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.root=tree.new Node(1);
		tree.root.left=tree.new Node(2);
		tree.root.right=tree.new Node(3);
		tree.root.left.right=tree.new Node(4);
		tree.root.left.left=tree.new Node(8);
		tree.root.left.left.right=tree.new Node(9);
		tree.root.right.left=tree.new Node(5);
		tree.root.right.left.left=tree.new Node(6);
		tree.root.right.left.left.left=tree.new Node(7);
		tree.root.right.left.left.left.right=tree.new Node(10);
		
		System.out.println(maxDepth(tree.root));
		
		
		
		

	}

}
