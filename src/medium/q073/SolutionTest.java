package medium.q073;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author abosen
 * @date 2018/8/1
 */
public class SolutionTest {

    @Test
    public void test1() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}};


        new Solution().setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};

        new Solution().setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    @Test
    public void test3() {
        int[][] matrix = {{1, 0, 3},};

        new Solution().setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }


}