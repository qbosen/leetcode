package easy.q724;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/11/06
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
        int[] param = {1, 7, 3, 6, 5, 6};
        int expect = 3;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[] param = {1, 2, 3};
        int expect = -1;
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, int expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            int result = answer.pivotIndex(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
