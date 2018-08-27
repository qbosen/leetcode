### 岛屿的个数
|	|	|
|---:|:---|
|题号|200|
|中文名|岛屿的个数|
|英文名|Number of Islands|
|难度|Medium|
|通过率|37.0%|
|链接|[number-of-islands](https://leetcode-cn.com/problems/number-of-islands/description/)
|标签|深度优先搜索, 广度优先搜索, 并查集|
|topics|Depth-first Search, Breadth-first Search, Union Find|


给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。

示例 1:

```
输入:
11110
11010
11000
00000

输出: 1

```

示例 2:

```
输入:
11000
11000
00100
00011

输出: 3

```



### 思路 2018/08/27
对每个岛进行遍历并修改，统计遍历次数