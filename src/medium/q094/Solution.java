package medium.q094;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abosen
 * @date 2018/8/13
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderAdd(list, root);
        return list;
    }

    private void inorderAdd(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        inorderAdd(list, node.left);
        list.add(node.val);
        inorderAdd(list, node.right);
    }
}
