package medium.q005;

import org.junit.Test;

/**
 * @author abosen
 * @date 2018/8/6
 */
public class SolutionTest {
    @Test
    public void test() {
        System.out.println(new Solution().longestPalindrome("babad"));
        System.out.println(new Solution().longestPalindrome("cbbd"));
        System.out.println(new Solution().longestPalindrome(""));
    }
}
