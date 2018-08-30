package medium.q046;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abosen
 * @date 2018/08/30
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        backtracking(lists, new ArrayList<>(), nums);
        return lists;
    }

    private void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num))
                    continue;
                tempList.add(num);
                backtracking(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}

