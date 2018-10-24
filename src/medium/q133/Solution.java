package medium.q133;

import structure.UndirectedGraphNode;

import java.util.*;

/**
 * @author qiubaisen
 * @date 2018/10/24
 */

public class Solution implements Answer {

    @Override
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();    // 遍历过的
        return dfsClone(map, node);
    }

    private UndirectedGraphNode dfsClone(Map<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        UndirectedGraphNode newNode = map.get(node.label);
        if (newNode != null) {
            return newNode;
        }
        newNode = new UndirectedGraphNode(node.label);
        map.put(newNode.label, newNode);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            newNode.neighbors.add(dfsClone(map, neighbor));
        }
        return newNode;
    }

}

