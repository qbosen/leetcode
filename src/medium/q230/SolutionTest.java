package medium.q230;

import static org.junit.Assert.*;

import org.junit.Test;
import structure.TreeNode;
import util.TreeNodeUtils;

/**
 * @author abosen
 * @date 2018/08/27
 */
public class SolutionTest {
    @Test
    public void test() {
        // simpleCase: [3,1,4,null,2]
        // simpleCase: 1
        Solution solution = new Solution();
        TreeNode root = TreeNodeUtils.fromArray(3, 1, 4, null, 2);
        assertEquals(1, solution.kthSmallest(root, 1));
        assertEquals(2, solution.kthSmallest(root, 2));
        assertEquals(3, solution.kthSmallest(root, 3));
    }

    @Test
    public void test2(){
        Solution solution = new Solution();
        TreeNode root = TreeNodeUtils.fromArray(5,3,6,2,4,null,null,1);
        assertEquals(1, solution.kthSmallest(root, 1));
        assertEquals(2, solution.kthSmallest(root, 2));
        assertEquals(3, solution.kthSmallest(root, 3));
        assertEquals(4, solution.kthSmallest(root, 4));
        assertEquals(5, solution.kthSmallest(root, 5));
        assertEquals(6, solution.kthSmallest(root, 6));
    }
}
