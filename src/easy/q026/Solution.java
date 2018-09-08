package easy.q026;

/**
 * @author abosen
 * @date 2018/09/08
 */

public class Solution implements Answer {
    @Override
    public int removeDuplicates(int[] nums) {
        int c = 0;

        for (int num : nums) {
            if (num != nums[c]) {
                nums[++c] = num;
            }
        }
        return c + 1;
    }
}
