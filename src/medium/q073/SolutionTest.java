package medium.q073;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Abosen
 * @date 2018/09/04
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [[1,1,1],[1,0,1],[1,1,1]]
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        new Solution().setZeroes(matrix);
        int[][] expect = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}};

        assertTrue(Arrays.deepEquals(expect, matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}};

        new Solution().setZeroes(matrix);
        int[][] expect = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}};

        assertTrue(Arrays.deepEquals(expect, matrix));
    }
}
