package easy.q160;

import structure.ListNode;

/**
 * @author qiubaisen
 * @date 2018/10/15
 */

public class Solution implements Answer {
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = countNode(headA);
        int countB = countNode(headB);

        while (countA != countB) {
            if (countA > countB) {
                countA--;
                headA = headA.next;
            } else {
                countB--;
                headB = headB.next;
            }
        }
        while (headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }


    private int countNode(ListNode node) {
        int i = 0;
        while (node != null) {
            node = node.next;
            i++;
        }
        return i;
    }
}
