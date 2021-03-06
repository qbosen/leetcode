package util;

import structure.TreeNode;

/**
 * @author abosen
 * @date 2018/8/13
 */
public class TreeNodeUtils {
    public static TreeNode fromArray(Integer... arr) {
        return recursiveCreate(arr, 0);
    }

    private static TreeNode recursiveCreate(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        TreeNode node = new TreeNode(arr[index]);
        node.left = recursiveCreate(arr, index * 2 + 1);
        node.right = recursiveCreate(arr, index * 2 + 2);
        return node;
    }

    public static boolean equals(TreeNode treeA, TreeNode treeB) {
        if (treeA == treeB) {
            return true;
        } else if (treeA == null || treeB == null) {
            // both are null will be handled on condition 'a == b'
            return false;
        } else if (treeA.val != treeB.val) {
            return false;
        } else {
            return equals(treeA.left, treeB.left) && equals(treeA.right, treeB.right);
        }
    }

}
