package medium.q054;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/11/20
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
        int[][] param = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        int[][] param = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        testAnswer(param, expect);
    }

    private void testAnswer(int[][] input, List<Integer> expect) {
        for (Answer answer : answers) {
            int[][] param = cloner.deepClone(input);
            List<Integer> result = answer.spiralOrder(param);

            boolean correct = CollectionUtils.isEqualCollection(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
