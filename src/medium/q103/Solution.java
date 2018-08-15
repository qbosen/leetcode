package medium.q103;

import structure.TreeNode;

import java.util.*;

/**
 * @author abosen
 * @date 2018/8/14
 */
public class Solution {
    private Map<Integer, LinkedList<Integer>> map;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        map = new TreeMap<>();
        recursive(1, root);
        return new ArrayList<>(map.values());
    }

    private void recursive(int level, TreeNode node) {
        if (node == null) {
            return;
        }
        add(level, node.val);
        recursive(level + 1, node.left);
        recursive(level + 1, node.right);
    }

    private void add(int level, int val) {
        if (!map.containsKey(level)) {
            map.put(level, new LinkedList<>());
        }
        if (level % 2 == 0) {
            map.get(level).addFirst(val);
        } else {
            map.get(level).addLast(val);
        }
    }
}
