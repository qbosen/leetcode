package medium.q279;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * @author qiubaisen
 * @date 2018/10/20
 */

public class Solution implements Answer {
    @Override
    public int numSquares(int n) {
        int[] squares = genSquares(n);
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        queue.add(n);
        set.add(n);
        int count = 0;

        while (!queue.isEmpty()) {
            count++;
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; i++) {
                int poll = queue.poll();

                for (int square : squares) {
                    if (square == poll) {
                        return count;
                    } else if (square < poll) {
                        int next = poll - square;
                        if (!set.contains(next)) {
                            queue.add(next);
                            set.add(next);
                        }
                    } else {
                        break;
                    }
                }

            }
        }
        return count;
    }

    private int[] genSquares(int n) {
        int l = (int) Math.sqrt(n);
        int[] squares = new int[l];
        for (int i = 1; i <= l; i++) {
            squares[i - 1] = i * i;
        }
        return squares;
    }
}
