package easy.q155;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */
public class StackBaseMinStack implements MinStack {
    private Stack<Integer> data;
    private Stack<Integer> min;

    // public MinStack(){
    public StackBaseMinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (min.empty() || min.peek() >= x) {
            min.push(x);
        }
    }


    public void pop() {
        int pop = data.pop();
        if (pop == min.peek()) {
            min.pop();
        }
    }


    public int top() {
        return data.peek();
    }


    public int getMin() {
        return min.peek();
    }
}
