package easy.q206;

import structure.ListNode;

/**
 * @author qiubaisen
 * @date 2018/11/21
 */

public class IterationSolution implements Answer {
    @Override
    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            // null或者单节点的情况
//            return head;
//        }
        // 迭代
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
