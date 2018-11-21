### 01 矩阵
|	|	|
|---:|:---|
|题号|542|
|中文名|01 矩阵|
|英文名|01 Matrix|
|难度|Medium|
|通过率|26.7%|
|链接|[01-matrix](https://leetcode-cn.com/problems/01-matrix/description/)|
|标签|深度优先搜索, 广度优先搜索|
|topics|Depth-first Search, Breadth-first Search|


给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。

两个相邻元素间的距离为 1 。

示例 1: 
输入:

```

0 0 0
0 1 0
0 0 0

```

输出:

```

0 0 0
0 1 0
0 0 0

```

示例 2: 
输入:

```

0 0 0
0 1 0
1 1 1

```

输出:

```

0 0 0
0 1 0
1 2 1

```

注意:

	给定矩阵的元素个数不超过 10000。
	给定矩阵中至少有一个元素是 0。
	矩阵中的元素只在四个方向上相邻: 上、下、左、右。



### 思路 2018/11/05
涟漪，像波纹一样传播

预处理一遍，把所有0放入队列，把所有1置为MIN_INT，遍历队列内容，将队列元素附近的