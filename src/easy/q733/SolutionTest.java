package easy.q733;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author qiubaisen
 * @date 2018/11/01
 */

public class SolutionTest {
    private static Cloner cloner;
    private static Answer[] answers;

    @BeforeClass
    public static void init() {
        cloner = new Cloner();
        answers = new Answer[]{new StructureBased(), new StructureImproved(), new CallStack()};
    }

    @Test
    public void test() {
        int[][] param = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expect = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        testAnswer(param, sr, sc, newColor, expect);
    }


    @Test
    public void test2() {
        int[][] param = {{0, 0, 0}, {0, 1, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        int[][] expect = {{0, 0, 0}, {0, 1, 1}};
        testAnswer(param, sr, sc, newColor, expect);
    }

    private void testAnswer(int[][] input, int sr, int sc, int newColor, int[][] expect) {
        for (Answer answer : answers) {
            int[][] param = cloner.deepClone(input);
            int[][] result = answer.floodFill(param, sr, sc, newColor);

            boolean correct = Arrays.deepEquals(expect, result);
            if (!correct) {
                String info = String.format("\nAnswer: %s\tExpect: %s\tActual: %s",
                        answer.getClass().getSimpleName(), Arrays.deepToString(expect), Arrays.deepToString(result));
                Assert.fail(info);
            }
        }
    }
}
