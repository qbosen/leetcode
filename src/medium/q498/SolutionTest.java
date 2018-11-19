package medium.q498;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author qiubaisen
 * @date 2018/11/16
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new Solution()};
    }

    @Test
    public void test() {
        // simpleCase: [[1,2,3],[4,5,6],[7,8,9]]
        int[][] param = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] expect = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        testAnswer(param, expect);
    }

    private void testAnswer(int[][] input, int[] expect) {
        for (Answer answer : answers) {
            int[][] param = cloner.deepClone(input);
            int[] result = answer.findDiagonalOrder(param);

            boolean correct = Arrays.equals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.toString(expect), Arrays.toString(result));
                Assert.fail(info);
            }
        }
    }
}
