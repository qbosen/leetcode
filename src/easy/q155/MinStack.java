package easy.q155;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */
public interface MinStack {
    void push(int x);

    void pop();

    int top();

    int getMin();
}
