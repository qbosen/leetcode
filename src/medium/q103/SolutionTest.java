package medium.q103;

import org.junit.Assert;
import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author abosen
 * @date 2018/8/14
 */
public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNodeUtils.fromArray(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> lists = solution.zigzagLevelOrder(treeNode);
        int[][] exp = {{3}, {20, 9}, {15, 7}};
        Assert.assertEquals(Arrays.deepToString(exp), lists.toString());
    }
}
