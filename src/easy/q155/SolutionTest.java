package easy.q155;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */

public class SolutionTest {
    private MinStack[] minStacks;

    @Before
    public void init() {
        minStacks = new MinStack[]{new ListBaseMinStack()};
    }

    @Test
    public void test() {
        for (MinStack minStack : minStacks) {
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);
            assertEquals(-3, minStack.getMin());
            minStack.pop();
            assertEquals(0, minStack.top());
            assertEquals(-2, minStack.getMin());
        }
    }

}
