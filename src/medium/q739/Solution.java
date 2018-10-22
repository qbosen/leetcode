package medium.q739;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */

public class Solution implements Answer {
    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> index = new Stack<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            while (!stack.empty() && temperature > stack.peek()) {
                int temp = stack.pop();
                int idx = index.pop();
                result[idx] = i - idx;
            }
            stack.push(temperature);
            index.push(i);
        }
        return result;
    }
}
