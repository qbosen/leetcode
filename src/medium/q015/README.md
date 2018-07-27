# 3Sum
## Description
Given an array `nums` of *n* integers, are there elements *a*, *b*, *c* in `nums` such that *a* + *b* + *c* = 0? 
Find all unique triplets in the array which gives the sum of zero.

**Note:**

The solution set must not contain duplicate triplets.

**Example:**
```
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

```

**Tags:** Array, Two Pointers

## 想法 2018/7/27

先排序,固定第一个数，后两个数向中间逼近，通过三数和的正负判断移动方向
关于去重：固定c,求a,b满足 c=a+b, 因为按大小顺序便利，所以c不重复,a在固定c不重复。
