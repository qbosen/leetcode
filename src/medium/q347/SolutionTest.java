package medium.q347;

import static org.junit.Assert.*;

import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Abosen
 * @date 2018/09/06
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [1,1,1,2,2,3]
        // simpleCase: 2
        int[] nums = {1, 1, 1, 2, 2, 3};
        List<Integer> expect = Arrays.asList(1, 2);

        run(expect, nums, 2);
    }

    @Test
    public void test2() {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        List<Integer> expect = Arrays.asList(-1, 2);

        run(expect, nums, 2);
    }

    private void run(List<Integer> expect, int[] nums, int k) {
        List<Integer> list = new Solution2().topKFrequent(nums, k);
        assertTrue(CollectionUtils.isEqualCollection(expect, list));
    }
}
