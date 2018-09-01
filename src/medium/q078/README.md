### 子集
|	|	|
|---:|:---|
|题号|078|
|中文名|子集|
|英文名|Subsets|
|难度|Medium|
|通过率|66.6%|
|链接|[subsets](https://leetcode-cn.com/problems/subsets/description/)
|标签|位运算, 数组, 回溯算法|
|topics|Bit Manipulation, Array, Backtracking|


给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

```
输入: nums = [1,2,3]
输出:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```



### 思路 2018/08/31
深度遍历，每个元素存在或者不存在