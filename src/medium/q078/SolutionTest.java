package medium.q078;

import static org.junit.Assert.*;

import org.junit.Test;
import util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author abosen
 * @date 2018/08/31
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [1,2,3]
        int[] sample = {1, 2, 3};
        List<List<Integer>> subsets = new Solution().subsets(sample);
        int[][] arr = {{3}, {1}, {2}, {1, 2, 3}, {1, 3}, {2, 3}, {1, 2}, {}};
        List<String> expect = new ArrayList<>();
        for (int[] ints : arr) {
            expect.add(Arrays.toString(ints));
        }
        List<String> result = new ArrayList<>();
        for (List<Integer> subset : subsets) {
            result.add(subset.toString());
        }

        assertTrue(CollectionUtils.isEqualCollection(expect, result));
    }
}
