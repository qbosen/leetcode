package medium.q094;

import structure.TreeNode;

import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/10/16
 */

@FunctionalInterface
public interface Answer {
    List<Integer> inorderTraversal(TreeNode root);
}
