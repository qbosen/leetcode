package medium.q075;

/**
 * @author abosen
 * @date 2018/09/08
 */

public class Solution implements Answer {
    @Override
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length;
        for (int i = 0; i < r; ) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            } else if (nums[i] == 2) {
                swap(nums, i, --r);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
