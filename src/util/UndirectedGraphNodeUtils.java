package util;

import structure.UndirectedGraphNode;

import java.util.*;

/**
 * @author qiubaisen
 * @date 2018/10/24
 */
public class UndirectedGraphNodeUtils {
    /**
     * 0,1,2#1,2#2,2
     */
    public static UndirectedGraphNode create(String exp) {
        if (exp == null || exp.length() == 0) return null;
        List<int[]> nodeList = new ArrayList<>();
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();

        for (String node : exp.split("#")) {
            String[] split = node.split(",");
            int[] ints = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                ints[i] = Integer.valueOf(split[i].trim());
            }
            int label = ints[0];
            map.put(label, new UndirectedGraphNode(label));
            nodeList.add(ints);
        }

        for (int[] ints : nodeList) {
            int label = ints[0];
            for (int i = 1; i < ints.length; i++) {
                UndirectedGraphNode node = map.get(label);
                node.neighbors.add(map.get(ints[i]));
            }
        }
        if (nodeList.size() == 0) return null;
        return map.get(nodeList.get(0)[0]);
    }

    public static String express(UndirectedGraphNode node) {
        if (node == null) return "";
        List<int[]> nodeList = new ArrayList<>();
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        recursiveResolve(nodeList, map, node);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            if (i != 0) stringBuilder.append('#');
            int[] ints = nodeList.get(i);
            for (int j = 0; j < ints.length; j++) {
                if (j != 0) stringBuilder.append(',');
                stringBuilder.append(ints[j]);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean equals(UndirectedGraphNode nodeA, UndirectedGraphNode nodeB) {
        String expressA = express(nodeA);
        String expressB = express(nodeB);
        // FIXME: 2018/10/24 测试使用，不能判断顺序不一致的情况
        return expressA.equals(expressB);
    }

    private static void recursiveResolve(List<int[]> list, Map<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null || map.containsKey(node.label)) {
            return;
        }
        int[] ints = new int[node.neighbors.size() + 1];
        ints[0] = node.label;
        int i = 1;
        for (UndirectedGraphNode neighbor : node.neighbors) {
            ints[i++] = neighbor.label;
        }
        list.add(ints);
        map.put(node.label, node);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            recursiveResolve(list, map, neighbor);
        }
    }
}
