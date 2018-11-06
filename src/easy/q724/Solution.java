package easy.q724;

/**
 * @author qiubaisen
 * @date 2018/11/06
 */

public class Solution implements Answer {
    @Override
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length < 1)
            return -1;
        if (nums.length == 1)
            return 0;

        int l = 0;
        int r = 0;
        for (int num : nums) {
            r += num;
        }

        for (int i = 0; i < nums.length; i++) {
            l += i == 0 ? 0 : nums[i - 1];
            r -= nums[i];
            if (l == r) return i;

        }
        return -1;
    }
}
