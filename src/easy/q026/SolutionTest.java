package easy.q026;

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
        // simpleCase: [1,1,2]
        int[] param = {1, 1, 2};
        int expectLen = 2;
        int[] expectArr = {1, 2};
        testAnswer(param, expectLen, expectArr);
    }

    @Test
    public void test2() {
        int[] param = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectLen = 5;
        int[] expectArr = {0, 1, 2, 3, 4};
        testAnswer(param, expectLen, expectArr);
    }

    private void testAnswer(int[] input, int expectLen, int[] expectArr) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            int result = answer.removeDuplicates(param);

            boolean correctLen = result == expectLen;
            boolean correctArr = true;
            for (int i = 0; i < expectLen; i++) {
                correctArr = correctArr && param[i] == expectArr[i];
            }

            if (!correctArr || !correctLen) {
                String infoLen = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expectLen, result);
                String infoArr = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.toString(expectArr), Arrays.toString(param));
                Assert.fail(String.format("len: %s\n arr: %s", infoLen, infoArr));
            }
        }
    }
}
