package easy.q160;

import structure.ListNode;

/**
 * @author abosen
 * @date 2018/8/10
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = countNode(headA);
        int l2 = countNode(headB);
        for (int i = 0; i < l1 - l2; i++) {
            headA = headA.next;
        }
        for (int i = 0; i < l2 - l1; i++) {
            headB = headB.next;
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int countNode(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}
