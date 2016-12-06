package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode_142 Given a linked list, return the node where the cycle begins. If
 * there is no cycle, return null.
 * 
 * Note: Do not modify the linked list.
 * 
 * @author rwxn
 *
 */
public class java_142 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {
		Map<ListNode, Boolean> visited = new HashMap<ListNode, Boolean>();
		if (head == null) {
			return null;
		}
		while (head.next != null) {
			if (visited.containsKey(head)) {
				if (visited.get(head) == true) {
					return head;
				}
			}
			visited.put(head, true);
			head = head.next;
		}
		return null;
	}
}
