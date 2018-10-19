package medium.q753;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/18
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new BasicSolution(), new Optimize1()};
    }

    @Test
    public void test() {
        String[] param = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int expect = 6;
        testAnswer(param, target, expect);
    }

    @Test
    public void test2() {
        String[] param = {"8888"};
        String target = "0009";
        int expect = 1;
        testAnswer(param, target, expect);
    }

    @Test
    public void test3() {
        String[] param = {"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        int expect = -1;
        testAnswer(param, target, expect);
    }
    @Test
    public void test4() {
        String[] param = {"0000"};
        String target = "8888";
        int expect = -1;
        testAnswer(param, target, expect);
    }


    private void testAnswer(String[] input, String target, int expect) {
        for (Answer answer : answers) {
//            String[] param = cloner.deepClone(input);
            int result = answer.openLock(input, target);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
