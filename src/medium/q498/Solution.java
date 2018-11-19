package medium.q498;

/**
 * @author qiubaisen
 * @date 2018/11/16
 */

public class Solution implements Answer {
    @Override
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null)
            return null;
        int m = matrix.length;
        if (m == 0)
            return new int[]{};

        int n = matrix[0].length;
        int[] res = new int[m * n];
        int i = 0, j = 0;
        // 右上,左下
        int[][] directions = {{-1, 1}, {1, -1}};
        int count = 0;
        while (count < res.length) {
            if (i >= 0 && i < m && j >= 0 && j < n) {
                res[count++] = matrix[i][j];
                int[] direction = directions[(i + j) % 2];
                i += direction[0];
                j += direction[1];
            } else if (i < 0 && j < n) {
                i++;
            } else if (j < 0 && i < m) {
                j++;
            } else if (i >= m && j < n) {
                j += 2;
                i--;
            } else if (j >= n && i < m) {
                i += 2;
                j--;
            }
        }
        return res;
    }

}
