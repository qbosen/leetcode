package medium.q054;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/11/20
 */

public class Solution implements Answer {
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Collections.EMPTY_LIST;
        }
        final int R = matrix.length;
        final int C = matrix[0].length;

        int top = -1, bottom = R, left = -1, right = C;
        Integer[] res = new Integer[R * C];
        int count = 0;
        int i = 0, j = 0;

        while (count < res.length) {
            while (j < right && count < res.length) {
                res[count++] = matrix[i][j++];
            }
            j--;
            top++;
            i++;
            while (i < bottom && count < res.length) {
                res[count++] = matrix[i++][j];
            }
            i--;
            right--;
            j--;
            while (j > left && count < res.length) {
                res[count++] = matrix[i][j--];
            }
            j++;
            bottom--;
            i--;
            while (i > top && count < res.length) {
                res[count++] = matrix[i--][j];
            }
            i++;
            left++;
            j++;
        }
        return Arrays.asList(res);
    }
}
