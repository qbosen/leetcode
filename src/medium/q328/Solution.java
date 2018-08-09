package medium.q328;

import structure.ListNode;

/**
 * @author abosen
 * @date 2018/8/9
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while (l2.next != null && l2.next.next != null) {
            l1.next = l2.next;
            l1 = l1.next;
            l2.next = l1.next;
            l2 = l2.next;
        }
        l1.next = l2.next;
        l2.next = dummy.next;
        return head;
    }
}
