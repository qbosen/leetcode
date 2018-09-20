### 全排列
|	|	|
|---:|:---|
|题号|046|
|中文名|全排列|
|英文名|Permutations|
|难度|Medium|
|通过率|60.6%|
|链接|[permutations](https://leetcode-cn.com/problems/permutations/description/)|
|标签|回溯算法|
|topics|Backtracking|


给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

```
输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```



### 思路 2018/09/20
递归添加所有数，如果存在就跳过。