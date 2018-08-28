### 电话号码的字母组合
|	|	|
|---:|:---|
|题号|017|
|中文名|电话号码的字母组合|
|英文名|Letter Combinations of a Phone Number|
|难度|Medium|
|通过率|43.0%|
|链接|[letter-combinations-of-a-phone-number](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/description/)
|标签|字符串, 回溯算法|
|topics|String, Backtracking|


给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

![](http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png)

示例:

```
输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

```

说明:
尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。



### 思路 2018/08/28
回溯算法 
f(n) = char(n) * f(n-1) if n < l
f(n) : addAll() if n == l