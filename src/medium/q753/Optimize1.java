package medium.q753;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author qiubaisen
 * @date 2018/10/19
 */
public class Optimize1 implements Answer {
    @Override
    public int openLock(String[] deadends, String target) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visit = new boolean[10000];   // 0-9999
        int goal = Integer.valueOf(target);
        for (String deadend : deadends) {
            // 标记死锁
            visit[Integer.valueOf(deadend)] = true;
        }
        if (visit[0]) {
            // 如果起点被锁，直接结束
            return -1;
        }

        int count = -1;
        queue.add(0);
        visit[0] = true;
        while (!queue.isEmpty()) {
            count++;
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; i++) {
                int current = queue.poll();
                if (goal == current) {
                    return count;
                }
                addLocks(queue, visit, current);
            }
        }
        return -1;
    }

    private void addLocks(Queue<Integer> queue, boolean[] visit, int lock) {
        int[] powers = {1, 10, 100, 1000};
        for (int power : powers) {
            int nextPower = power * 10;
            int bit = (lock - lock / nextPower * nextPower) / power;
            int tAdd = bit == 9 ? lock - 9 * power : lock + power;
            if (!visit[tAdd]) {
                queue.add(tAdd);
                visit[tAdd] = true;
            }
            int tSub = bit == 0 ? lock + 9 * power : lock - power;
            if (!visit[tSub]) {
                queue.add(tSub);
                visit[tSub] = true;
            }
        }
    }

}
