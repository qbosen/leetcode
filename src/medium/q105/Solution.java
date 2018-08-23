package medium.q105;

/**
 * @author abosen
 * @date 2018/08/21
 */

import structure.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0);
    }

    private TreeNode buildTree(int[] preorder, int pst, int ped, int[] inorder, int ist) {
        int l = ped - pst;
        if (l < 0) {
            return null;
        } else if (l == 0) {
            return new TreeNode(preorder[pst]);
        }
        TreeNode node = new TreeNode(preorder[pst]);
        int idx = search(inorder, preorder[pst], ist);
        int limit = idx - ist;
        node.left = buildTree(preorder, pst + 1, pst + limit, inorder, ist);
        node.right = buildTree(preorder, pst + limit + 1, ped, inorder, ist + limit + 1);
        return node;
    }

    private int search(int[] arr, int tar, int fr) {
        for (int i = fr; i < arr.length; i++) {
            if (tar == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
