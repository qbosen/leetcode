package medium.q003;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author abosen
 * @date 2018/09/10
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
        // simpleCase: "abcabcbb"
        String param = "abcabcbb";
        int expect = 3;
        testAnswer(param, expect);
    }

    @Test
    public void testSome() {
        testAnswer("pwwkew", 3);
        testAnswer("", 0);
    }

    private void testAnswer(String input, int expect) {
        for (Answer answer : answers) {
            String param = input;
            int result = answer.lengthOfLongestSubstring(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
