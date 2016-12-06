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
	
	// �Ľ����������������������
	public TreeNode invertTree(TreeNode root) {
		// �Ľ����������������������
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
