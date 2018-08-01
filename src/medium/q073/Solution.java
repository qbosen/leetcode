package medium.q073;

/**
 * @author abosen
 * @date 2018/8/1
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        boolean r0 = false, c0 = false;
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                r0 = true;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                c0 = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (r0) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        if (c0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
