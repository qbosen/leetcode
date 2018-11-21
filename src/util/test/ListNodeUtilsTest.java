package util.test;

import org.junit.Test;
import structure.ListNode;
import util.ListNodeUtils;

import static org.junit.Assert.assertEquals;

/**
 * @author qiubaisen
 * @date 2018/11/21
 */
public class ListNodeUtilsTest {
    @Test
    public void toStringTest() {
        ListNode node = ListNodeUtils.fromArray(1, 2, 3, 4, 5);
        assertEquals("ListNode[1,2,3,4,5,null]", ListNodeUtils.toString(node));
    }

    @Test
    public void toStringEmptyTest() {
        ListNode node = ListNodeUtils.fromArray();
        assertEquals("ListNode[null]", ListNodeUtils.toString(node));
    }

    @Test
    public void toStringOneTest() {
        ListNode node = ListNodeUtils.fromArray(2);
        assertEquals("ListNode[2,null]", ListNodeUtils.toString(node));
    }
}
