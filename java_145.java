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
 *Ҫ��ʹ�õ���������ʹ�õݹ飬�Ľ��������
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
		//�Ƚ����ڵ���ջ��Ȼ����������ջ���ٽ���������ջ
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
			list.add(stack.peek().val);//���������һ��Ԫ�س�ջ������list��
			stack.pop();
			
		}
		
		
		
		return null;
	}
}
