package medium.q073;

/**
 * @author Abosen
 * @date 2018/09/04
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return;
        }
        boolean r0 = false;
        // 1. 标记第一行
        for (int i : matrix[0]) {
            if (i == 0) {
                r0 = true;
                break;
            }
        }
        // 2. 删行标列
        for (int i = 1; i < matrix.length; i++) {
            boolean current0 = false;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    current0 = true;
                    matrix[0][j] = 0;
                }

            }
            if (current0) {
                for (int k = 0; k < matrix[0].length; k++) {
                    matrix[i][k] = 0;
                }
            }
        }

        // 3. 根据列标删列
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 4. 根据标记 处理第一行
        if (r0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
