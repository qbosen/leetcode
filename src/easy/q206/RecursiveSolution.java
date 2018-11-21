package easy.q206;

import structure.ListNode;

/**
 * @author qiubaisen
 * @date 2018/11/21
 */
public class RecursiveSolution implements Answer {

    @Override
    public ListNode reverseList(ListNode head) {
        return recursive(null, head);
    }

    private ListNode recursive(ListNode pre, ListNode cur) {
        if (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            return recursive(cur, next);
        } else {
            return pre;
        }
    }
}
