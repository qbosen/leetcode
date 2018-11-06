package medium.q871;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<List<Integer>> param = new ArrayList<>();
        param.add(Arrays.asList(1));
        param.add(Arrays.asList(2));
        param.add(Arrays.asList(3));
        param.add(Arrays.asList());
        boolean expect = true;
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        List<List<Integer>> param = new ArrayList<>();
        param.add(Arrays.asList(1, 3));
        param.add(Arrays.asList(3, 0, 1));
        param.add(Arrays.asList(2));
        param.add(Arrays.asList(0));
        boolean expect = false;
        testAnswer(param, expect);
    }

    private void testAnswer(List<List<Integer>> input, boolean expect) {
        for (Answer answer : answers) {
            List<List<Integer>> param = cloner.deepClone(input);
            boolean result = answer.canVisitAllRooms(param);

            boolean correct = result == expect;
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
