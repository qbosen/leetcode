### 相交链表
|	|	|
|---:|:---|
|题号|160|
|中文名|相交链表|
|英文名|Intersection of Two Linked Lists|
|难度|Easy|
|通过率|29.6%|
|链接|[intersection-of-two-linked-lists](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/)|
|标签|链表|
|topics|Linked List|


编写一个程序，找到两个单链表相交的起始节点。

例如，下面的两个链表：

```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3

```

在节点 c1 开始相交。

注意：

	如果两个链表没有交点，返回 null.
	在返回结果后，两个链表仍须保持原有的结构。
	可假定整个链表结构中没有循环。
	程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。

致谢:
特别感谢 @stellari 添加此问题并创建所有测试用例。



### 思路 2018/10/15
计算链表长度，计算出交点位置