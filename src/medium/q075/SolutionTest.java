package medium.q075;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author abosen
 * @date 2018/09/08
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
        // simpleCase: [2,0,2,1,1,0]
        int[] param = {2, 0, 2, 1, 1, 0};
        int[] expect = {0, 0, 1, 1, 2, 2};
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[] param = {1, 2, 0};
        int[] expect = {0, 1, 2};
        testAnswer(param, expect);
    }

    @Test
    public void test3() {
        int[] param = {0, 1, 0};
        int[] expect = {0, 0, 1};
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, int[] expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            answer.sortColors(param);

            boolean correct = Arrays.equals(param, expect);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.toString(expect), Arrays.toString(param));
                Assert.fail(info);
            }
        }
    }
}
