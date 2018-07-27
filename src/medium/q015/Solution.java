package medium.q015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author abosen
 * @date 2018/7/20
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        assert nums.length > 2;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        Integer lastI = null;
        for (int i = 0; i < nums.length; i++) {
            if (isDuplicate(lastI, nums[i])) {
                continue;
            }
            lastI = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            Integer lastJ = null;
            while (j < k) {
                if (isDuplicate(lastJ, nums[j])) {
                    j++;
                    continue;
                }
                lastJ = nums[j];
                int sum = sum(nums, i, j, k);
                if (sum > 0) {
                    k--;
                    // 移动k时, j不做验重比较
                    lastJ = null;
                } else if (sum < 0) {
                    j++;
                } else {
                    list.add(fill(nums, i, j, k));
                    j++;
                }
            }
        }

        return list;
    }

    private int sum(int[] nums, int i, int j, int k) {
        return nums[i] + nums[j] + nums[k];
    }

    private List<Integer> fill(int[] nums, int i, int j, int k) {
        return Arrays.asList(nums[i], nums[j], nums[k]);
    }

    private boolean isDuplicate(Integer last, int current) {
        return last != null && last == current;
    }
}
