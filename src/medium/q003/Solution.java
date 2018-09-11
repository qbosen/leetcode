package medium.q003;

/**
 * @author abosen
 * @date 2018/09/10
 */

public class Solution implements Answer {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int start = 0;
        int[] index = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            start = Integer.max(start, index[c]);
            ans = Integer.max(ans, i - start + 1);
            index[c] = i + 1;
        }
        return ans;
    }
}
