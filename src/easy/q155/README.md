### 最小栈
|	|	|
|---:|:---|
|题号|155|
|中文名|最小栈|
|英文名|Min Stack|
|难度|Easy|
|通过率|44.9%|
|链接|[min-stack](https://leetcode-cn.com/problems/min-stack/description/)|
|标签|栈, 设计|
|topics|Stack, Design|


设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

	push(x) -- 将元素 x 推入栈中。
	pop() -- 删除栈顶的元素。
	top() -- 获取栈顶元素。
	getMin() -- 检索栈中的最小元素。

示例:

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.

```



### 思路 2018/10/22
用一个List保存最小值，当入值<=当前最小值时，保存该最小值
pop时，校验该值与当前最小值关系，若相等则移除最小值