package medium.q094;

import org.junit.Assert;
import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

import java.util.Arrays;

/**
 * @author abosen
 * @date 2018/8/13
 */
public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNodeUtils.fromArray(1, null, 2, null, null, 3);
        String result = solution.inorderTraversal(treeNode).toString();
        Assert.assertEquals(Arrays.toString(new Integer[]{1, 3, 2}), result);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNodeUtils.fromArray(1, 2, 3, 4, null, 5);
        String result = solution.inorderTraversal(treeNode).toString();
        Assert.assertEquals(Arrays.toString(new Integer[]{4, 2, 1, 5, 3}), result);
    }

}
