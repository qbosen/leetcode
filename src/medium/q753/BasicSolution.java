package medium.q753;

import java.util.*;

/**
 * @author qiubaisen
 * @date 2018/10/18
 */

public class BasicSolution implements Answer {
    @Override
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new ArrayDeque<>();
        Set<String> set = new HashSet<>();      // 去重复
        String init = "0000";
        queue.add(init);
        set.add(init);
        int count = -1;

        while (!queue.isEmpty()) {
            count++;
            // 取出该层所有 并操作
            int currentLayerSize = queue.size();
            for (int i = 0; i < currentLayerSize; i++) {
                String poll = queue.poll();
                if (target.equals(poll)) {
                    return count;
                }
                if (isDead(deadends, poll)) {
                    continue;
                }
                queue.addAll(rotateInAllDirection(poll, set));
            }
        }
        return -1;
    }

    private boolean isDead(String[] deadends, String current) {
        for (String deadend : deadends) {
            if (current.equals(deadend))
                return true;
        }
        return false;
    }

    private List<String> rotateInAllDirection(String lock, Set<String> set) {
        List<String> nextLocks = new ArrayList<>();
        boolean[] directions = {true, false};
        for (int i = 0; i < 4; i++) {
            for (boolean direction : directions) {
                String newLock = rotate(lock, i, direction);
                if (!set.contains(newLock)) {
                    set.add(newLock);
                    nextLocks.add(newLock);
                }
            }
        }
        return nextLocks;
    }

    private String rotate(String lock, int pos, boolean increaseDirection) {
        assert lock.length() == 4;
        assert pos < 4 && pos >= 0;

        char[] chars = lock.toCharArray();
        if (increaseDirection) {
            if (chars[pos] == '9') {
                chars[pos] = '0';
            } else {
                chars[pos]++;
            }
        } else {
            if (chars[pos] == '0') {
                chars[pos] = '9';
            } else {
                chars[pos]--;
            }
        }
        return new String(chars);
    }
}
