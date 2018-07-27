package medium.q015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author abosen
 * @date 2018/7/20
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int sum = sum(nums, i, j, k);
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    list.add(fill(nums, i, j, k));
                    j++;
                    k--;
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

}
