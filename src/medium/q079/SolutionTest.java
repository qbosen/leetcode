package medium.q079;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author abosen
 * @date 2018/09/02
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
        // simpleCase: "ABCCED"

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";

        assertTrue(new Solution().exist(board, word));
    }
}
