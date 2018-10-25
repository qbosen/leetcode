package medium.q494;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/25
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new BasicDfs(), new MemoryDfs()};
    }

    @Test
    public void test() {
        int[] param = {1, 1, 1, 1, 1};
        int target = 3;
        int expect = 5;
        testAnswer(param, target, expect);
    }

    private void testAnswer(int[] input, int target, int expect) {
        for (Answer answer : answers) {
            int result = answer.findTargetSumWays(input, target);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
