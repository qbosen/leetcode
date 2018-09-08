package util.test;

import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author abosen
 * @date 2018/8/28
 */
public class CollectionUtilsTest {
    @Test
    public void testList() {
        List list = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List list2 = Arrays.asList("be", "bf", "cd", "ce", "cf", "ad", "ae", "af", "bd");
        List list3 = Arrays.asList("be", "bf", "cd", "ce", "cf", "ad", "ae", "af");

        assertTrue(CollectionUtils.isEqualCollection(list, list2));
        assertFalse(CollectionUtils.isEqualCollection(list2, list3));
    }

    @Test
    public void testDualTest() {
        List<List<String>> l1 = Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("nat", "tan"), Arrays.asList("bat"));
        List<List<String>> l2 = Arrays.asList(Arrays.asList("bat"), Arrays.asList("ate", "tea", "eat"), Arrays.asList("tan", "nat"));
        List<List<String>> l3 = Arrays.asList(Arrays.asList("bat"), Arrays.asList("ate", "tea1", "eat"), Arrays.asList("tan", "nat"));

        assertTrue(CollectionUtils.isEqualDualList(l1, l2));
        assertFalse(CollectionUtils.isEqualDualList(l2, l3));
    }

}
