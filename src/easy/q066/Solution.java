package easy.q066;

/**
 * @author qiubaisen
 * @date 2018/11/12
 */

public class Solution implements Answer {
    @Override
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            if (i == 0) {
                int[] ints = new int[digits.length + 1];
                ints[0] = 1;
                System.arraycopy(digits, 0, ints, 1, digits.length);
                return ints;
            }
        }
        return digits;
    }
}
