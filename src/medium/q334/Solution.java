package medium.q334;

/**
 * @author abosen
 * @date 2018/8/7
 */
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > high) {
                return true;
            } else if (num < low) {
                low = num;
            } else if (num > low) {
                high = num;
            }
        }
        return false;
    }
}
