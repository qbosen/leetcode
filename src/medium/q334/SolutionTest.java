package medium.q334;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author abosen
 * @date 2018/8/7
 */
public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.increasingTriplet(new int[]{2, 3, 1, 2, 3}));
        assertTrue(solution.increasingTriplet(new int[]{2, 3, 1, 4}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }
}
