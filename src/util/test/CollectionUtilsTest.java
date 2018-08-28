package util.test;

import org.junit.Test;
import util.CollectionUtils;

import java.util.Arrays;
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
}
