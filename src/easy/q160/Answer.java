package easy.q160;

import structure.ListNode;

/**
 * @author qiubaisen
 * @date 2018/10/15
 */

@FunctionalInterface
public interface Answer {
    ListNode getIntersectionNode(ListNode headA, ListNode headB);
}
