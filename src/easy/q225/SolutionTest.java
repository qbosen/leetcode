package easy.q225;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author qiubaisen
 * @date 2018/10/30
 */

public class SolutionTest {


    @Test
    public void test() {
        Solution.MyStack stack = new Solution().new MyStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
    }

}
