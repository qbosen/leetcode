### 单词搜索
|	|	|
|---:|:---|
|题号|079|
|中文名|单词搜索|
|英文名|Word Search|
|难度|Medium|
|通过率|31.7%|
|链接|[word-search](https://leetcode-cn.com/problems/word-search/description/)|
|标签|数组, 回溯算法|
|topics|Array, Backtracking|


给定一个二维网格和一个单词，找出该单词是否存在于网格中。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中"相邻"单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

示例:

```
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

给定 word = "ABCCED", 返回 true.
给定 word = "SEE", 返回 true.
给定 word = "ABCB", 返回 false.
```



### 思路 2018/09/02
使用or来标记走过的路，回溯时还原