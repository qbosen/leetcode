### 字母异位词分组
|	|	|
|---:|:---|
|题号|049|
|中文名|字母异位词分组|
|英文名|Group Anagrams|
|难度|Medium|
|通过率|47.0%|
|链接|[group-anagrams](https://leetcode-cn.com/problems/group-anagrams/description/)|
|标签|哈希表, 字符串|
|topics|Hash Table, String|


给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

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



### 思路 2018/09/08
把字符串视为 char array 内部排序, hash新 string 比较