package medium.q116;

import static org.junit.Assert.*;

import org.junit.Test;
import structure.TreeLinkNode;
import util.TreeLinkNodeUtils;
import util.TreeNodeUtils;

/**
 * @author abosen
 * @date 2018/08/24
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: {}
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        TreeLinkNode noLinkTree = TreeLinkNodeUtils.fromArray(false, ints);
        TreeLinkNode linkTree = TreeLinkNodeUtils.fromArray(ints);
        new Solution().connect(noLinkTree);
        assertTrue(TreeLinkNodeUtils.equals(linkTree, noLinkTree));
    }
}
