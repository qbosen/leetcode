package easy.q748;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/11/10
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
        int[] param = {0, 0, 0, 1};
        int expect = 3;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[] param = {3, 6, 1, 0};
        int expect = 1;
        testAnswer(param, expect);
    }

    @Test
    public void test3() {
        int[] param = {1, 2, 3, 4};
        int expect = -1;
        testAnswer(param, expect);
    }

    @Test
    public void test4() {
        int[] param = {0, 0, 3, 2};
        int expect = -1;
        testAnswer(param, expect);
    }

    @Test
    public void test5() {
        int[] param = {1, 0};
        int expect = 0;
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, int expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            int result = answer.dominantIndex(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
