package medium.q200;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author abosen
 * @date 2018/08/27
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
        char[][] chars = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        assertEquals(1, new Solution().numIslands(chars));
    }

    @Test
    public void test2() {
        char[][] chars = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        assertEquals(3, new Solution().numIslands(chars));
    }

    @Test
    public void test3() {
        char[][] chars = {};
        assertEquals(0, new Solution().numIslands(chars));
    }
}
