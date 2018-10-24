package util.test;

import org.junit.Test;
import structure.UndirectedGraphNode;
import util.UndirectedGraphNodeUtils;

import static org.junit.Assert.*;

/**
 * @author qiubaisen
 * @date 2018/10/24
 */
public class UndirectedGraphNodeUtilsTest {
    @Test
    public void testCreateNull() {
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create("");
        assertNull(node);
    }

    @Test
    public void testCreateSingle() {
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create("1");
        assertEquals(1, node.label);
        assertEquals(0, node.neighbors.size());
    }

    @Test
    public void testCreate() {
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create("0,1,2#1,2#2,2");
        System.out.println(node);       // debug to check
    }

    @Test
    public void testExpressNull() {
        String exp = "";
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create(exp);
        String express = UndirectedGraphNodeUtils.express(node);
        assertEquals(exp, express);
    }

    @Test
    public void testExpressSingle() {
        String exp = "1";
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create(exp);
        String express = UndirectedGraphNodeUtils.express(node);
        assertEquals(exp, express);
    }

    @Test
    public void testExpress() {
        String exp = "0,1,2#1,2#2,2";
        UndirectedGraphNode node = UndirectedGraphNodeUtils.create(exp);
        String express = UndirectedGraphNodeUtils.express(node);
        assertEquals(exp, express);
    }

    @Test
    public void testEquals() {
        equalTest("");
        equalTest("1");
        equalTest("0,1,2#1,2#2,2");
    }

    @Test
    public void testNotEqual() {
        UndirectedGraphNode nodeA = UndirectedGraphNodeUtils.create("0,1#1,2#2,2");
        UndirectedGraphNode nodeB = UndirectedGraphNodeUtils.create("0,1,2#1,2#2,2");
        assertFalse(UndirectedGraphNodeUtils.equals(nodeA, nodeB));
    }

    private void equalTest(String exp) {
        UndirectedGraphNode nodeA = UndirectedGraphNodeUtils.create(exp);
        UndirectedGraphNode nodeB = UndirectedGraphNodeUtils.create(exp);
        assertTrue(UndirectedGraphNodeUtils.equals(nodeA, nodeB));
    }

}
