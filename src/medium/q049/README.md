给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

Given an array of strings, group anagrams together.

示例:
```
输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
```
说明：

所有输入均为小写字母。
不考虑答案输出的顺序。


思路: 2018-08-04

把字符串视为 char array 内部排序, hash新 string 比较
