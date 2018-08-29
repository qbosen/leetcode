### 括号生成
|	|	|
|---:|:---|
|题号|022|
|中文名|括号生成|
|英文名|Generate Parentheses|
|难度|Medium|
|通过率|63.4%|
|链接|[generate-parentheses](https://leetcode-cn.com/problems/generate-parentheses/description/)
|标签|字符串, 回溯算法|
|topics|String, Backtracking|


给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

例如，给出 n = 3，生成结果为：

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

```



### 思路 2018/08/29
回溯, 提前判断合法性，过滤错误