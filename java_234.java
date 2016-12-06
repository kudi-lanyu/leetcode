package leetcode;

import java.awt.List;
import java.time.format.ResolverStyle;

/**
 * leetcode_234
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * @author rwxn
 *
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

public class java_234 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private ListNode Reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode cur_next = null;
		pre.next = null;
		while (cur != null) {
			cur_next = cur.next;// ��¼��һ��Ҫ��ת�Ľڵ�

			cur.next = pre;// ��ǰ���Ѿ���ת��������뵽cur����
			pre = cur;// �����´η�תʱǰ���Ѿ���ת�����ͷ�ڵ�

			cur = cur_next;// ����Ҫ����ڵ�λ��
		}
		return pre;
	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// ��Len Ϊ������fast != null ,fast.next == null;��ʱslow == Mid;
		// ��Len Ϊż����fast.next != null, fast.next.next == null;
		// ��ʱslow == Math.ceil(Mid-1),ceilֻҪ��С����+1

		if (fast != null) {
			slow = slow.next;
		}
		

		// ��ת��������
		slow = Reverse(slow);

		// ����ת���������ǰ���������бȽ�
		while (slow != null) {
			if (head.val != slow.val) {
				return false;
			}
			slow = slow.next;
			head = head.next;
		}

		return true;
	}
}
