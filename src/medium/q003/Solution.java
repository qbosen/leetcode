package medium.q003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author abosen
 * @date 2018/8/4
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (set.contains(c)) {
                int start = i - count;
                while (charArray[start] != c) {
                    set.remove(charArray[start]);
                    count--;
                    start++;
                }
            } else {
                set.add(c);
                count++;
                max = count > max ? count : max;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];// current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
