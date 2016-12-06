package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
 * @author rwxn
 *
 *要求使用迭代，不能使用递归，改进后序遍历
 */
public class java_145 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (root == null) {
			return null;
		}
		//先将根节点入栈，然后将右子树入栈，再将左子树入栈
		stack.push(root);
		while (stack.peek() != null) {
			TreeNode node = stack.peek();
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}			
		}
		while (stack.peek() != null) {
			list.add(stack.peek().val);//后序遍历第一个元素出栈并存入list中
			stack.pop();
			
		}
		
		
		
		return null;
	}
}
