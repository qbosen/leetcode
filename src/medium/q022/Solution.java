package medium.q022;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abosen
 * @date 2018/08/29
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTracking(n, "", list);
        return list;
    }

    private void backTracking(int n, String s, List<String> list) {
        int count = legalProcess(s);
        int length = s.length();
        if (count < 0 || count > n || length > 2 * n - count) {
            return;
        } else {
            if (length == 2 * n && count == 0) {
                list.add(s);
                return;
            }
        }
        backTracking(n, s + '(', list);
        backTracking(n, s + ')', list);
    }

    private int legalProcess(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (count < 0) {
                return -1;
            }
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }
}
