package easy.q206;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

/**
 * @author qiubaisen
 * @date 2018/11/21
 */

public class SolutionTest {
    private static Answer[] answers;
    private static Cloner cloner;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new IterationSolution(), new RecursiveSolution()};
    }

    @Test
    public void test() {
        // simpleCase: [1,2,3,4,5]
        ListNode param = ListNodeUtils.fromArray(1, 2, 3, 4, 5);
        ListNode expect = ListNodeUtils.fromArray(5, 4, 3, 2, 1);
        testAnswer(param, expect);
    }

    @Test
    public void testEmpty() {
        ListNode param = ListNodeUtils.fromArray();
        ListNode expect = ListNodeUtils.fromArray();
        testAnswer(param, expect);
    }

    @Test
    public void testOne() {
        ListNode param = ListNodeUtils.fromArray(1);
        ListNode expect = ListNodeUtils.fromArray(1);
        testAnswer(param, expect);
    }

    @Test
    public void testTwo() {
        ListNode param = ListNodeUtils.fromArray(1, 2);
        ListNode expect = ListNodeUtils.fromArray(2, 1);
        testAnswer(param, expect);
    }

    private void testAnswer(ListNode input, ListNode expect) {
        for (Answer answer : answers) {
            ListNode param = cloner.deepClone(input);
            ListNode result = answer.reverseList(param);

            boolean correct = ListNodeUtils.equals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), ListNodeUtils.toString(expect), ListNodeUtils.toString(result));
                Assert.fail(info);
            }
        }
    }
}
