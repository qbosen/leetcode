package medium.q494;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiubaisen
 * @date 2018/10/25
 */
public class MemoryDfs implements Answer {
    @Override
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return memoryDfs(nums, S, 0, 0, new HashMap<>());
    }

    private int memoryDfs(int[] nums, int S, int sum, int index, Map<String, Integer> map) {
        String key = String.format("%d->%d", index, sum);
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if (index == nums.length) {
            return S == sum ? 1 : 0;
        }

        int add = memoryDfs(nums, S, sum + nums[index], index + 1, map);
        int sub = memoryDfs(nums, S, sum - nums[index], index + 1, map);
        map.put(key, add + sub);
        return add + sub;
    }
}
