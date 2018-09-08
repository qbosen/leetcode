package medium.q049;

import java.util.List;

/**
 * @author abosen
 * @date 2018/09/08
 */

@FunctionalInterface
public interface Answer {
    List<List<String>> groupAnagrams(String[] strs);
}
