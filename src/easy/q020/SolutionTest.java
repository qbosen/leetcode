package easy.q020;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
        answers = new Answer[]{new Solution()};
    }

    @Test
    public void test() {
        String param = "()";
        boolean expect = true;
        testAnswer(param, expect);
    }

    @Test
    public void test1() {
        String param = "()[]{}";
        boolean expect = true;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        String param = "(]";
        boolean expect = false;
        testAnswer(param, expect);
    }

    @Test
    public void test3() {
        String param = "([)]";
        boolean expect = false;
        testAnswer(param, expect);
    }

    @Test
    public void test4() {
        String param = "{[]}";
        boolean expect = true;
        testAnswer(param, expect);
    }

    @Test
    public void test5() {
        String param = "]}";
        boolean expect = false;
        testAnswer(param, expect);
    }

    @Test
    public void test6() {
        String param = "[{";
        boolean expect = false;
        testAnswer(param, expect);
    }


    private void testAnswer(String input, boolean expect) {
        for (Answer answer : answers) {
            String param = cloner.deepClone(input);
            boolean result = answer.isValid(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
