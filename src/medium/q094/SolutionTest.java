package medium.q094;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/10/16
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
        // simpleCase: [1,null,2,3]
        TreeNode param = TreeNodeUtils.fromArray(1, null, 2, null, null, 3);
        List<Integer> expect = Arrays.asList(1, 3, 2);
        testAnswer(param, expect);
    }

    @Test
    public void test2() {
        TreeNode param = TreeNodeUtils.fromArray(1, 2, 3, 4, null, 5);
        List<Integer> expect = Arrays.asList(4, 2, 1, 5, 3);
        testAnswer(param, expect);
    }

    private void testAnswer(TreeNode input, List<Integer> expect) {
        for (Answer answer : answers) {
            TreeNode param = cloner.deepClone(input);
            List<Integer> result = answer.inorderTraversal(param);

            boolean correct = expect.equals(result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
