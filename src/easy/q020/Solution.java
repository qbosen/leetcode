package easy.q020;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */

public class Solution implements Answer {
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char pop = stack.pop();
                boolean valid;
                switch (c) {
                    case ')':
                        valid = pop == '(';
                        break;
                    case ']':
                        valid = pop == '[';
                        break;
                    case '}':
                        valid = pop == '{';
                        break;
                    default:
                        valid = true;
                }
                if (!valid) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
