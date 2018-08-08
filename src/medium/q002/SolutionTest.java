package medium.q002;

import org.junit.Assert;
import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

/**
 * @author abosen
 * @date 2018/8/8
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test() {
        testForm(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8});
        testForm(new int[]{2}, new int[]{9, 6, 4}, new int[]{1, 7, 4});
        testForm(new int[]{}, new int[]{}, new int[]{});
        testForm(new int[]{5}, new int[]{5}, new int[]{0, 1});

    }

    public void testForm(int[] l1, int[] l2, int[] ans) {
        ListNode res = solution.addTwoNumbers(ListNodeUtils.fromArray(l1), ListNodeUtils.fromArray(l2));
        Assert.assertTrue(ListNodeUtils.equals(ListNodeUtils.fromArray(ans), res));
    }
}
