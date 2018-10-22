package medium.q739;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new Solution(), new ReverseTraversal()};
    }

    @Test
    public void test() {
        // simpleCase: [73,74,75,71,69,72,76,73]
        int[] param = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expect = {1, 1, 4, 2, 1, 1, 0, 0};
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[] param = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        int[] expect = {8, 1, 5, 4, 3, 2, 1, 1, 0, 0};
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, int[] expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            int[] result = answer.dailyTemperatures(param);

            boolean correct = Arrays.equals(result, expect);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.toString(expect), Arrays.toString(result));
                Assert.fail(info);
            }
        }
    }
}
