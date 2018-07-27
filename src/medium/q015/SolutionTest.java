package medium.q015;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author abosen
 * @date 2018/7/27
 */
public class SolutionTest {

    @Test
    public void test() {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = new Solution().threeSum(arr);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}