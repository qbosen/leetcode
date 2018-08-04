package medium.q049;

import org.junit.Test;

/**
 * @author abosen
 * @date 2018/8/4
 */
public class SolutionTest {
    @Test
    public void test() {
        String[] inputs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Solution().groupAnagrams(inputs));
    }
}
