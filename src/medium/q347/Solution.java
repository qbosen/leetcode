package medium.q347;

import java.util.*;

/**
 * @author Abosen
 * @date 2018/09/06
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>(8);
        Map<Integer, Integer> indexMap = new HashMap<>(8);
        List<Integer> sortedList = new ArrayList<>();

        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
                indexMap.put(num, sortedList.size());
                sortedList.add(num);
            } else {
                int newCount = countMap.get(num) + 1;
                countMap.put(num, newCount);
                int index = indexMap.get(num);
                while (index > 0) {
                    int bigI = index - 1;
                    Integer bNum = sortedList.get(bigI);
                    Integer bCount = countMap.get(bNum);
                    Integer sNum = sortedList.get(index);
                    Integer sCount = countMap.get(sNum);
                    if (sCount > bCount) {
                        int temp = sNum;
                        sortedList.set(index, bNum);
                        sortedList.set(bigI, temp);

                        indexMap.put(sNum, indexMap.get(bNum));
                        indexMap.put(bNum, index);
                        index = bigI;
                    } else {
                        break;
                    }
                }
            }
        }
        return sortedList.subList(0, k);
    }
}
