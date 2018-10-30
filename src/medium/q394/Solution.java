package medium.q394;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/30
 */

public class Solution implements Answer {
    @Override
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> chars = new Stack<>();

        int n = 0;
        String res = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + c - '0';
            } else if (Character.isAlphabetic(c)) {
                res = res + c;
            } else if (c == '[') {
                nums.push(n);
                chars.push(res);
                n = 0;
                res = "";
            } else {
                int count = nums.pop();
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    temp.append(res);
                }
                res = chars.pop() + temp;
            }
        }
        return res;
    }
}
