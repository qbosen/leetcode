package easy.q160;

import org.junit.Assert;
import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

/**
 * @author abosen
 * @date 2018/8/10
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test() {
        ListNode common = ListNodeUtils.fromArray(7, 8, 9);
        ListNode l1 = ListNodeUtils.fromArray(1, 2, 3);
        ListNodeUtils.findLastNode(l1).next = common;
        ListNode l2 = ListNodeUtils.fromArray(4, 5);
        ListNodeUtils.findLastNode(l2).next = common;

        ListNode intersectionNode = solution.getIntersectionNode(l1, l2);
        Assert.assertSame(common, intersectionNode);
    }

    @Test
    public void test2() {
        ListNode l1 = ListNodeUtils.fromArray(1, 2, 3);
        ListNode l2 = ListNodeUtils.fromArray(4, 5);

        ListNode intersectionNode = solution.getIntersectionNode(l1, l2);
        Assert.assertSame(null, intersectionNode);
    }
}
