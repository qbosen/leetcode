package util;

import structure.ListNode;

/**
 * @author abosen
 * @date 2018/8/8
 */
public class ListNodeUtils {
    public static ListNode fromArray(int... ints) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int anInt : ints) {
            current.next = new ListNode(anInt);
            current = current.next;
        }

        return dummy.next;
    }

    public static boolean equals(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null && l1.val == l2.val) {
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null) {
            return true;
        }
        return false;
    }
}
