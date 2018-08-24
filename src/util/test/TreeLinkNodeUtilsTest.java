package util.test;

import org.junit.Test;
import structure.TreeLinkNode;
import util.TreeLinkNodeUtils;

import static org.junit.Assert.*;

/**
 * @author abosen
 * @date 2018/8/24
 */
public class TreeLinkNodeUtilsTest {
    @Test
    public void testPower() {
//        assertEquals(1, TreeLinkNodeUtils.twoPower(0));
//        assertEquals(2, TreeLinkNodeUtils.twoPower(1));
//        assertEquals(8, TreeLinkNodeUtils.twoPower(3));
//        assertEquals(1024, TreeLinkNodeUtils.twoPower(10));
    }

    @Test
    public void testCreate() {
        TreeLinkNode node = TreeLinkNodeUtils.fromArray(0, 1, 2, 3, 4, 5, 6);
        // debug to check
        System.out.println(node);
    }

    @Test
    public void testEqual() {
        TreeLinkNode node1 = TreeLinkNodeUtils.fromArray(0, 1, 2, 3, 4, 5, 6);
        TreeLinkNode node2 = TreeLinkNodeUtils.fromArray(0, 1, 2, 3, 4, 5, 6);
        TreeLinkNode node3 = TreeLinkNodeUtils.fromArray(0, 1, 2, 3, 4, 5, 7);
        assertTrue(TreeLinkNodeUtils.equals(node1, node2));
        assertFalse(TreeLinkNodeUtils.equals(node1, node3));
    }
}
