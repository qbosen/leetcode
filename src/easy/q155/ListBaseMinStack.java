package easy.q155;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */

public class ListBaseMinStack implements MinStack{
    private List<Integer> data;
    private List<Integer> min;

    // public MinStack(){
    public ListBaseMinStack() {
        data = new ArrayList<>();
        min = new ArrayList<>();
    }

    public void push(int x) {
        data.add(x);
        if (min.isEmpty() || min.get(min.size() - 1) >= x) {
            min.add(x);
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            int remove = data.remove(data.size() - 1);
            if (min.get(min.size() - 1) == remove) {
                min.remove(min.size() - 1);
            }
        }
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return min.get(min.size() - 1);
    }
}

