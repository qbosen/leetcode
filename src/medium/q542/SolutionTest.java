package medium.q542;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author qiubaisen
 * @date 2018/11/05
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
        int[][] param = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expect = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        testAnswer(param, expect);
    }


    @Test
    public void test2() {
        int[][] param = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expect = {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        testAnswer(param, expect);
    }


    private void testAnswer(int[][] input, int[][] expect) {
        for (Answer answer : answers) {
            int[][] param = cloner.deepClone(input);
            int[][] result = answer.updateMatrix(param);

            boolean correct = Arrays.deepEquals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.deepToString(expect), Arrays.deepToString(result));
                Assert.fail(info);
            }
        }
    }
}
