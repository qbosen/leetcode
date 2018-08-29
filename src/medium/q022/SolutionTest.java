package medium.q022;

import static org.junit.Assert.*;

import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Abosen
 * @date 2018/08/29
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: 3
        List<String> list = new Solution().generateParenthesis(3);
        List<String> expect = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(CollectionUtils.isEqualCollection(expect, list));
    }
}
