package medium.q049;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.List;

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
        // simpleCase: ["eat","tea","tan","ate","nat","bat"]
        String[] param = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expect = Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("nat", "tan"), Arrays.asList("bat"));

        testAnswer(param, expect);
    }

    private void testAnswer(String[] input, List<List<String>> expect) {
        for (Answer answer : answers) {
            String[] param = cloner.deepClone(input);
            List<List<String>> result = answer.groupAnagrams(param);

            boolean correct = CollectionUtils.isEqualDualList(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), expect, result);
                Assert.fail(info);
            }
        }
    }

}
