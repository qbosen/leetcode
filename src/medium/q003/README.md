### 无重复字符的最长子串
|	|	|
|---:|:---|
|题号|003|
|中文名|无重复字符的最长子串|
|英文名|Longest Substring Without Repeating Characters|
|难度|Medium|
|通过率|24.3%|
|链接|[longest-substring-without-repeating-characters](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/)|
|标签|哈希表, 双指针, 字符串|
|topics|Hash Table, Two Pointers, String|


给定一个字符串，找出不含有重复字符的最长子串的长度。

示例 1:

```
输入: "abcabcbb"
输出: 3 
解释: 无重复字符的最长子串是 "abc"，其长度为 3。

```

示例 2:

```
输入: "bbbbb"
输出: 1
解释: 无重复字符的最长子串是 "b"，其长度为 1。

```

示例 3:

```
输入: "pwwkew"
输出: 3
解释: 无重复字符的最长子串是 "wke"，其长度为 3。
     请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。

```



### 思路 2018/09/11
使用一个128的数组 保存每个char出现位置。

遍历时，找到这个字符上一次出现的位置，（无出现为-1）那么当前可能最大长度是: 当前位置 - 上次位置

如果该值大于最大值，更新。同时更新数组这个字符的位置。

因为数组初始化为0， 所以**使用该数组保存每个char出现的位置+1**， *长度为：当前-上次+1*
