package medium.q150;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/23
 */

public class Solution implements Answer {
    @Override
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            Integer n = null;
            switch (token) {
                case "+":
                    n = stack.pop() + stack.pop();
                    break;
                case "-":
                    int b = stack.pop();
                    n = stack.pop() - b;
                    break;
                case "*":
                    n = stack.pop() * stack.pop();
                    break;
                case "/":
                    int c = stack.pop();
                    n = stack.pop() / c;
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }
            if (n != null) {
                stack.push(n);
            }
        }
        return stack.peek();
    }
}
