package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author abosen
 * @date 2018/8/28
 */
public class CollectionUtils {
    public static boolean isEqualCollection(Collection a, Collection b) {
        if (a.size() != b.size()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>(16);
        for (Object o : a) {
            Integer count = map.get(o);
            if (count == null) {
                map.put(o, 1);
            } else {
                map.put(o, count + 1);
            }
        }

        for (Object o : b) {
            Integer count = map.get(o);
            if (count == null) {
                return false;
            } else {
                map.put(o, count - 1);
            }
        }

        for (Integer integer : map.values()) {
            if (integer != 0) {
                return false;
            }
        }
        return true;
    }
}
