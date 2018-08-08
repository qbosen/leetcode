package medium.q002;

import structure.ListNode;

/**
 * @author abosen
 * @date 2018/8/8
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int num = getVal(l1) + getVal(l2) + carry;
            carry = num > 9 ? 1 : 0;
            num = num > 9 ? num - 10 : num;
            current.next = new ListNode(num);
            current = current.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return dummy.next;
    }

    private int getVal(ListNode node) {
        return node == null ? 0 : node.val;
    }

}
