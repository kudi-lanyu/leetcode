package leetcode;

/**
 * leetcode_104
 * 
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
/**
 * Definition for a binary tree node.
 * 
 * public class TreeNode {
 * 
 * int val;
 * 
 * TreeNode left;
 * 
 * TreeNode right;
 * 
 * TreeNode(int x) { val = x; }
 * 
 * }
 */
public class java_104 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public int maxDepth(TreeNode root) {
		//DFS
		if (root == null) {
			return 0;
		}
		int left_len = maxDepth(root.left);
		
		int right_len = maxDepth(root.right);
		
		return left_len > right_len ? left_len+1 : right_len+1;
	}
}
