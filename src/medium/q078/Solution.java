package medium.q078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abosen
 * @date 2018/08/31
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        backtracking(lists, new ArrayList<>(), 0, nums);
        return lists;
    }

    private void backtracking(List<List<Integer>> lists, List<Integer> temp, int start, int[] nums) {
        lists.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtracking(lists, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}