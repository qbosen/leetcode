### 完全平方数
|	|	|
|---:|:---|
|题号|279|
|中文名|完全平方数|
|英文名|Perfect Squares|
|难度|Medium|
|通过率|41.7%|
|链接|[perfect-squares](https://leetcode-cn.com/problems/perfect-squares/description/)|
|标签|广度优先搜索, 数学, 动态规划|
|topics|Breadth-first Search, Math, Dynamic Programming|


给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。

示例 1:

```
输入: n = 12
输出: 3 
解释: 12 = 4 + 4 + 4.
```

示例 2:

```
输入: n = 13
输出: 2
解释: 13 = 4 + 9.
```



### 思路 2018/10/20
找到范围内的平方数 queue里面存放 减去后的值，注意去重复。
每一层为操作 减去比当前小的平方数 放入queue

### 2018/10/20 数学方法

* Lagrange's four-square theorem 四平方数和定理
> 任何一个正整数都可以被表示为四个整数的平方的和

* three-square theorem 三平方数和定理
> 一个正整数可以被表示为三个整数的平方的和，当且仅当该数<b>不能</b>被表达为 4<sup>k</sup>(8m+7), k,m 为整数

所以满足上述式子的一定是 4 个整数的平方和
