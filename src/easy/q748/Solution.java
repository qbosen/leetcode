package easy.q748;

/**
 * @author qiubaisen
 * @date 2018/11/10
 */

public class Solution implements Answer {
    @Override
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        if (nums.length == 1)
            return 0;

        boolean b = nums[0] > nums[1];
        int max = b ? nums[0] : nums[1];
        int smax = b ? nums[1] : nums[0];
        int index = b ? 0 : 1;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > smax)
                smax = nums[i];
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
                index = i;
            }
        }
        return max >= 2 * smax ? index : -1;
    }
}
