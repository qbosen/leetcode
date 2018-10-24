package medium.q133;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import structure.UndirectedGraphNode;
import util.UndirectedGraphNodeUtils;

/**
 * @author qiubaisen
 * @date 2018/10/24
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
        // simpleCase: {}
        UndirectedGraphNode param = UndirectedGraphNodeUtils.create("0,1,2#1,2#2,2");
        UndirectedGraphNode expect = UndirectedGraphNodeUtils.create("0,1,2#1,2#2,2");
        testAnswer(param, expect);
    }

    @Test
    public void test1() {
        // simpleCase: {}
        UndirectedGraphNode param = UndirectedGraphNodeUtils.create("");
        UndirectedGraphNode expect = UndirectedGraphNodeUtils.create("");
        testAnswer(param, expect);
    }

    private void testAnswer(UndirectedGraphNode input, UndirectedGraphNode expect) {
        for (Answer answer : answers) {
//            UndirectedGraphNode param = cloner.deepClone(input);
            UndirectedGraphNode result = answer.cloneGraph(input);

            boolean correct = UndirectedGraphNodeUtils.equals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }
}
