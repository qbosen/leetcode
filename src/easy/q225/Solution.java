package easy.q225;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author qiubaisen
 * @date 2018/10/30
 */

public class Solution {
    class MyStack {
        private Queue<Integer> in;
        private Queue<Integer> out;

        public MyStack() {
            in = new ArrayDeque<>();
            out = new ArrayDeque<>();
        }

        public void push(int x) {
            in.add(x);
        }

        public int pop() {
            while (!in.isEmpty() && in.size() != 1) {
                out.add(in.poll());
            }
            int pop = in.poll();
            while (!out.isEmpty()) {
                in.add(out.poll());
            }
            return pop;
        }

        public int top() {
            while (!in.isEmpty() && in.size() != 1) {
                out.add(in.poll());
            }
            int poll = in.poll();
            while (!out.isEmpty()) {
                in.add(out.poll());
            }
            in.add(poll);
            return poll;
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }

    }

}
