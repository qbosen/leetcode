package medium.q049;

import java.util.*;

/**
 * @author abosen
 * @date 2018/8/4
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
