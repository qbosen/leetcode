package medium.q279;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/20
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new Solution(), new MathSolution()};
    }

    @Test
    public void test() {
        // simpleCase: 12
        int param = 12;
        int expect = 3;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int param = 13;
        int expect = 2;
        testAnswer(param, expect);
    }

    private void testAnswer(int input, int expect) {
        for (Answer answer : answers) {
//            int param = cloner.deepClone(input);
            int result = answer.numSquares(input);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
