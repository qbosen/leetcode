package medium.q078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abosen
 * @date 2018/08/31
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        backtracking(nums, 0, new ArrayList<>(), lists);
        return lists;
    }

    private void backtracking(int[] nums, int idx, List<Integer> temp, List<List<Integer>> list) {
        if (idx == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {
            backtracking(nums, idx + 1, temp, list);
            temp.add(nums[idx]);
            backtracking(nums, idx + 1, temp, list);
            temp.remove(temp.size() - 1);
        }

    }
}

