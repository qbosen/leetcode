package medium.q017;

import static org.junit.Assert.*;

import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Abosen
 * @date 2018/08/28
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: "23"
        List<String> list = new Solution().letterCombinations("23");
        List expect = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertTrue(CollectionUtils.isEqualCollection(expect, list));
    }

    @Test
    public void test2() {
        List<String> list = new Solution().letterCombinations("");
        List expect = Collections.emptyList();
        assertTrue(CollectionUtils.isEqualCollection(expect, list));
    }

}
