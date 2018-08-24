### 填充同一层的兄弟节点
|	|	|
|---:|:---|
|题号|116|
|中文名|填充同一层的兄弟节点|
|英文名|Populating Next Right Pointers in Each Node|
|难度|Medium|
|通过率|34.3%|
|链接|[populating-next-right-pointers-in-each-node](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/description/)
|标签|树, 深度优先搜索|
|topics|Tree, Depth-first Search|


给定一个二叉树

```
struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
```

填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。

说明:

	你只能使用额外常数空间。
	使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
	你可以假设它是一个完美二叉树（即所有叶子节点都在同一层，每个父节点都有两个子节点）。

示例:

给定完美二叉树，

```
     1
   /  \
  2    3
 / \  / \
4  5  6  7
```

调用你的函数后，该完美二叉树变为：

```
     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \  / \
4->5->6->7 -> NULL
```



### 思路 2018/08/24
构建在上层联通的基础上，一次联通一层