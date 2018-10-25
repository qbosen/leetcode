package medium.q494;

/**
 * @author qiubaisen
 * @date 2018/10/25
 */

public class BasicDfs implements Answer {
    @Override
    public int findTargetSumWays(int[] nums, int S) {
        int[] count = new int[1];
        dfs(nums, S, count, 0, 0);
        return count[0];
    }

    private void dfs(int[] nums, int S, int[] count, int idx, int sum) {
        if (idx == nums.length) {
            if (sum == S) {
                count[0]++;
            }
            return;
        }
        dfs(nums, S, count, idx + 1, sum + nums[idx]);
        dfs(nums, S, count, idx + 1, sum - nums[idx]);
    }
}
