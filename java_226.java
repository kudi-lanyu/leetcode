package leetcode;

/**
 * leetcode_226
 * 
 * 
 * @author rwxn
 *
 */

public class java_226 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	// 改进后序遍历，交换左右子树
	public TreeNode invertTree(TreeNode root) {
		// 改进后序遍历，交换左右子树
		TreeNode tmp = null;
		if (root != null) {
			invertTree(root.left);
			invertTree(root.right);
			tmp = root.left;
			root.left = root.right;
			root.right = tmp;
		}
		return root;
	}
}
