package medium.q542;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author qiubaisen
 * @date 2018/11/05
 */

public class Solution implements Answer {
    @Override
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new ArrayDeque<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        final int INF = Integer.MIN_VALUE;

        // 预处理
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = INF;
                }
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            for (int[] direction : directions) {
                int r = pos[0] + direction[0];
                int c = pos[1] + direction[1];
                if (r < 0 || r >= m || c < 0 || c >= n || matrix[r][c] != INF)
                    continue;
                matrix[r][c] = matrix[pos[0]][pos[1]] + 1;
                queue.add(new int[]{r, c});
            }
        }
        return matrix;
    }
}
