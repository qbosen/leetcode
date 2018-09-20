package medium.q046;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abosen
 * @date 2018/09/20
 */

public class Solution implements Answer {
    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        backtracking(lists, new ArrayList<>(), nums);
        return lists;
    }

    private void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for (int num : nums) {
            if (tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            backtracking(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}
