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
			cur_next = cur.next;// 记录下一个要反转的节点

			cur.next = pre;// 讲前面已经反转的链表接入到cur后面
			pre = cur;// 更新下次反转时前面已经反转链表的头节点

			cur = cur_next;// 更新要处理节点位置
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
		// 若Len 为奇数，fast != null ,fast.next == null;此时slow == Mid;
		// 若Len 为偶数，fast.next != null, fast.next.next == null;
		// 此时slow == Math.ceil(Mid-1),ceil只要有小数都+1

		if (fast != null) {
			slow = slow.next;
		}
		

		// 反转后半段链表
		slow = Reverse(slow);

		// 将反转后的链表与前半段链表进行比较
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
