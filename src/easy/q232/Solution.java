package easy.q232;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/29
 */

public class Solution {
    class MyQueue {
        private Stack<Integer> in;
        private Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            if (out.empty())
                flipping();
            return out.pop();
        }

        public int peek() {
            if (out.empty())
                flipping();
            return out.peek();
        }

        public boolean empty() {
            return in.empty() && out.empty();
        }

        private void flipping() {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
    }

}
