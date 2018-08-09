package medium.q328;

import org.junit.Assert;
import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

/**
 * @author abosen
 * @date 2018/8/9
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode node = solution.oddEvenList(ListNodeUtils.fromArray(1, 2, 3, 4, 5));
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(1, 3, 5, 2, 4), node));
    }

    @Test
    public void test2() {
        ListNode node = solution.oddEvenList(ListNodeUtils.fromArray(2, 1, 3, 5, 6, 4, 7));
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(2, 3, 6, 7, 1, 5, 4), node));
    }

    @Test
    public void test3() {
        ListNode node = solution.oddEvenList(ListNodeUtils.fromArray());
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(), node));
    }

    @Test
    public void test4() {
        ListNode node = solution.oddEvenList(ListNodeUtils.fromArray(1));
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(1), node));
    }

    @Test
    public void test5() {
        ListNode node = solution.oddEvenList(ListNodeUtils.fromArray(1, 2));
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(1, 2), node));
    }
}
