package easy.q232;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/29
 */

public class SolutionTest {

    @Test
    public void test() {
        Solution.MyQueue queue = new Solution().new MyQueue();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
    }

}
