package medium.q003;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author abosen
 * @date 2018/8/4
 */
public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int length;
        length = solution.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, length);
        length = solution.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1, length);
        length = solution.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3, length);
        length = solution.lengthOfLongestSubstring("dvdf");
        Assert.assertEquals(3, length);
        length = solution.lengthOfLongestSubstring("ohvhjdml");
        Assert.assertEquals(6, length);
    }

}
