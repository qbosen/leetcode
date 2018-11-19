### 对角线遍历
|	|	|
|---:|:---|
|题号|498|
|中文名|对角线遍历|
|英文名|Diagonal Traverse|
|难度|Medium|
|通过率|32.4%|
|链接|[diagonal-traverse](https://leetcode-cn.com/problems/diagonal-traverse/description/)|
|标签||
|topics||


给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

示例:

```
输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

输出:  [1,2,4,7,5,3,6,8,9]

解释:

```
![](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/diagonal_traverse.png)

说明:

	给定矩阵中的元素总数不会超过 100000 。



### 思路 2018/11/16
关键是边界的处理

1. 在一次斜边移动中 i+j 不变，可以作为方向的区分
2. 对可能的边界值画图，可得到明显区分的四个区域，分别处理