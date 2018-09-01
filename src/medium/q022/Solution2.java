package medium.q022;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/9/1
 */
public class Solution2 extends Solution{
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtracking("", list, n, n);
        return list;
    }

    private void backtracking(String str, List<String> list, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(str);
        }
        if (left > 0) {
            backtracking(str + '(', list, left - 1, right);
        }
        if (left < right) {
            backtracking(str + ')', list, left, right - 1);
        }
    }
}
