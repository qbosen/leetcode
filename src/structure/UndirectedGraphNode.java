package structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/10/24
 */
public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }
}
