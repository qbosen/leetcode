package medium.q003;

/**
 * @author abosen
 * @date 2018/8/4
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] index = new int[128];

        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
