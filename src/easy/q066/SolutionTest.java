package easy.q066;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author qiubaisen
 * @date 2018/11/12
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
        int[] param = {1, 2, 3};
        int[] expect = {1, 2, 4};
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[] param = {4, 3, 2, 1};
        int[] expect = {4, 3, 2, 2};
        testAnswer(param, expect);
    }

    @Test
    public void test3() {
        int[] param = {0};
        int[] expect = {1};
        testAnswer(param, expect);
    }

    @Test
    public void test4() {
        int[] param = {1, 9};
        int[] expect = {2, 0};
        testAnswer(param, expect);
    }

    @Test
    public void test5() {
        int[] param = {9, 9};
        int[] expect = {1, 0, 0};
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, int[] expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            int[] result = answer.plusOne(param);

            boolean correct = Arrays.equals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.toString(expect), Arrays.toString(result));
                Assert.fail(info);
            }
        }
    }
}
