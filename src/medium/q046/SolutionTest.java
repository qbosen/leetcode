package medium.q046;

import static org.junit.Assert.*;

import org.junit.Test;
import util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author abosen
 * @date 2018/08/30
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [1,2,3]

        List<List<Integer>> permute = new Solution().permute(new int[]{1, 2, 3});
        List<String> result = new ArrayList<>();
        permute.forEach(l -> result.add(l.toString()));

        List<String> expect = new ArrayList<>();
        int[][] arr = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        for (int[] ints : arr) {
            expect.add(Arrays.toString(ints));
        }

        assertTrue(CollectionUtils.isEqualCollection(expect, result));
    }
}
