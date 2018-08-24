package util;

import structure.TreeLinkNode;

/**
 * @author abosen
 * @date 2018/8/24
 */
public class TreeLinkNodeUtils {
    public static TreeLinkNode fromArray(int... arr) {
        return fromArray(true, arr);
    }

    public static TreeLinkNode fromArray(boolean withLink, int... arr) {
        int temp = arr.length + 1;
        int depth = 0;
        while (temp != 0) {
            temp >>= 1;
            depth++;
        }
        // Complete binary tree
        assert arr.length + 1 == twoPower(depth);

        TreeLinkNode[] nodes = new TreeLinkNode[arr.length];
        for (int i = 0, l = 1; i < arr.length; i++) {
            nodes[i] = new TreeLinkNode(arr[i]);
            int hIdx = twoPower(l - 1) - 1;
            if (withLink) {
                if (i == hIdx) {
                    l++;
                } else {
                    nodes[i - 1].next = nodes[i];
                }
            }
        }
        recursiveConnect(nodes, 0);
        return nodes[0];
    }

    private static TreeLinkNode recursiveConnect(TreeLinkNode[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        TreeLinkNode node = arr[index];
        node.left = recursiveConnect(arr, index * 2 + 1);
        node.right = recursiveConnect(arr, index * 2 + 2);
        return node;
    }

    private static int twoPower(int n) {
        assert n >= 0;
        int i = 1;
        while (n > 0) {
            i <<= 1;
            n--;
        }
        return i;
    }

    public static boolean equals(TreeLinkNode treeA, TreeLinkNode treeB) {
        if (treeA == treeB) {
            return true;
        } else if (treeA == null || treeB == null) {
            // both are null will be handled on condition 'a == b'
            return false;
        } else if (treeA.val != treeB.val) {
            return false;
        } else {
            return equals(treeA.left, treeB.left) && equals(treeA.right, treeB.right) && equals(treeA.next, treeB.next);
        }
    }
}
