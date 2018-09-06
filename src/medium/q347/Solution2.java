package medium.q347;

import java.util.*;

/**
 * @author Abosen
 * @date 2018/09/06
 */
class Solution2 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        int[] count = new int[max - min + 1];
        int[] index = new int[max - min + 1];
        int[] sort = new int[max - min + 1];
        int last = 0;

        for (int num : nums) {
            int idx = num - min;
            if (count[idx] == 0) {
                count[idx] = 1;
                index[idx] = last;
                sort[last++] = num;
            } else {
                count[idx]++;
                int j = index[idx];
                while (j > 0) {
                    int i = j - 1;
                    int iNum = sort[i];
                    int jNum = sort[j];
                    if (count[jNum - min] > count[iNum - min]) {
                        sort[j] = iNum;
                        sort[i] = jNum;

                        index[jNum - min] = i;
                        index[iNum - min] = j;
                        j = i;
                    } else {
                        break;
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(sort[i]);
        }
        return list;
    }
}
