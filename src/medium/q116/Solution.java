package medium.q116;

/**
 * @author abosen
 * @date 2018/08/24
 */

import structure.TreeLinkNode;

public class Solution {
    public void connect(TreeLinkNode root) {
        while (root != null && root.left != null) {
            siblingConnect(root);
            root = root.left;
        }
    }

    private void siblingConnect(TreeLinkNode node) {
        while (node != null && node.left != null) {
            node.left.next = node.right;
            if (node.next != null) {
                node.right.next = node.next.left;
            }
            node = node.next;
        }
    }
}
