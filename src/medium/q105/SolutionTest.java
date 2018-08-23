package medium.q105;

import static org.junit.Assert.*;

import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

/**
 * @author abosen
 * @date 2018/08/21
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [3,9,20,15,7]
        // simpleCase: [9,3,15,20,7]
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = new Solution().buildTree(preorder, inorder);
        TreeNode expectTree = TreeNodeUtils.fromArray(3, 9, 20, null, null, 15, 7);
        assertTrue(TreeNodeUtils.equals(expectTree, treeNode));
    }

    @Test
    public void test2() {
        int[] preorder = {1, 2, 3};
        int[] inorder = {2, 3, 1};
        TreeNode treeNode = new Solution().buildTree(preorder, inorder);
        TreeNode expectTree = TreeNodeUtils.fromArray(1, 2, null, null, 3);
        assertTrue(TreeNodeUtils.equals(expectTree, treeNode));
    }
}
