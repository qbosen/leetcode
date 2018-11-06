package medium.q871;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/11/06
 */

public class Solution implements Answer {
    @Override
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        set.add(0);
        stack.push(0);
        int count = 1;
        while (!stack.empty()) {
            Integer room = stack.pop();

            for (Integer key : rooms.get(room)) {
                if (!set.contains(key)) {
                    count++;
                    set.add(key);
                    stack.push(key);
                }
            }
        }
        return count == rooms.size();
    }

}
