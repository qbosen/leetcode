package medium.q046;

import com.rits.cloning.Cloner;
import medium.q022.Solution2;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author abosen
 * @date 2018/09/20
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
        // simpleCase: [1,2,3]
        int[] param = {1, 2, 3};
        Integer[][] expectArr = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        List<List<Integer>> expect = new ArrayList<>();
        for (Integer[] ints : expectArr) {
            expect.add(Arrays.asList(ints));
        }
        testAnswer(param, expect);
    }

    private void testAnswer(int[] input, List<List<Integer>> expect) {
        for (Answer answer : answers) {
            int[] param = cloner.deepClone(input);
            List<List<Integer>> result = answer.permute(param);

            boolean correct = CollectionUtils.isEqualDualList(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
