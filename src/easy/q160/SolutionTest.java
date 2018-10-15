package easy.q160;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

/**
 * @author qiubaisen
 * @date 2018/10/15
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
        // simpleCase: No intersection: []
        // simpleCase: []
        ListNode common = ListNodeUtils.fromArray(7, 8, 9);
        ListNode l1 = ListNodeUtils.fromArray(1, 2, 3);
        ListNodeUtils.findLastNode(l1).next = common;
        ListNode l2 = ListNodeUtils.fromArray(4, 5);
        ListNodeUtils.findLastNode(l2).next = common;

        testAnswer(l1, l2, common);
    }

    private void testAnswer(ListNode l1, ListNode l2, ListNode expect) {
        for (Answer answer : answers) {
            ListNode result = answer.getIntersectionNode(l1, l2);

            boolean correct = ListNodeUtils.equals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
