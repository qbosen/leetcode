package medium.q005;

/**
 * @author abosen
 * @date 2018/8/6
 */
public class Solution {
    int start, end;

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            update(array, i, i);
            update(array, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    public void update(char[] array, int l, int r) {
        while (l >= 0 && r < array.length && array[l] == array[r]) {
            l--;
            r++;
        }

        if (end - start < r - l - 2) {
            start = l + 1;
            end = r - 1;
        }
    }
}
