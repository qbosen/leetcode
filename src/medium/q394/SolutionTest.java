package medium.q394;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qiubaisen
 * @date 2018/10/30
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
        String param = "3[a]2[bc]";
        String expect = "aaabcbc";
        testAnswer(param, expect);
    }
    @Test
    public void test2() {
        String param = "3[a2[c]]";
        String expect = "accaccacc";
        testAnswer(param, expect);
    }
    @Test
    public void test3() {
        String param = "2[abc]3[cd]ef";
        String expect = "abcabccdcdcdef";
        testAnswer(param, expect);
    }

    private void testAnswer(String input, String expect) {
        for (Answer answer : answers) {
            String result = answer.decodeString(input);

            boolean correct = result.equals(expect);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
