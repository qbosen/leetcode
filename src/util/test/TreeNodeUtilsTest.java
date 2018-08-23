package util.test;

import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author abosen
 * @date 2018/8/23
 */
public class TreeNodeUtilsTest {

    @Test
    public void test() {
        assertTrue(TreeNodeUtils.equals(null, null));
        assertTrue(TreeNodeUtils.equals(new TreeNode(0), new TreeNode(0)));
        assertFalse(TreeNodeUtils.equals(new TreeNode(0), new TreeNode(1)));

        TreeNode node1 = TreeNodeUtils.fromArray(3, 9, 20, null, null, 15, 7);
        TreeNode node2 = TreeNodeUtils.fromArray(3, 9, 20, null, null, 15, 7);
        TreeNode node3 = TreeNodeUtils.fromArray(3, 9, 20, null, null, null, 7);
        assertTrue(TreeNodeUtils.equals(node1, node2));
        assertFalse(TreeNodeUtils.equals(node1, node3));
    }
}
