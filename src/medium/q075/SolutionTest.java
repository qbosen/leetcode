package medium.q075;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author abosen
 * @date 2018/09/05
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [2,0,2,1,1,0]
        int[] p = {2, 0, 2, 1, 1, 0};
        int[] exp = {0, 0, 1, 1, 2, 2};
        run(p, exp);
    }

    private void run(int[] param, int[] exp) {
        new Solution().sortColors(param);
        assertTrue(Arrays.equals(exp, param));
    }
}
