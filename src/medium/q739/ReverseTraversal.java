package medium.q739;

/**
 * @author qiubaisen
 * @date 2018/10/22
 */
public class ReverseTraversal implements Answer {
    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;       // 最后一个数
        for (int i = temperatures.length - 2; i >= 0; i--) {
            int j = i + 1;      // 可能比当前数大的那个数的下标
            while (temperatures[i] >= temperatures[j] && res[j] != 0) {
                // 当前数不小于下一个数， 且下个数不是已遍历的最大值, 那就找下一个大于 下个数 的数
                // 直到 找到了一个比当前数大的数， 遍历完所有，当前数为所有的最大数
                j = j + res[j];
            }
            if (temperatures[j] > temperatures[i]) {
                // 找到了最近的大数, 否则 当前为最大数，则为0
                res[i] = j - i;
            }
        }
        return res;
    }
}
