package medium.q150;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/23
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
        String[] param = {"2", "1", "+", "3", "*"};
        int expect = 9;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        String[] param = {"4", "13", "5", "/", "+"};
        int expect = 6;
        testAnswer(param, expect);
    }

    @Test
    public void test3() {
        String[] param = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expect = 22;
        testAnswer(param, expect);
    }

    private void testAnswer(String[] input, int expect) {
        for (Answer answer : answers) {
            String[] param = cloner.deepClone(input);
            int result = answer.evalRPN(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
