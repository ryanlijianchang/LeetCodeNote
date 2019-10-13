### 1.二维数组中的查找 ###

**题目描述**

在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

**题解思路**

- (1)暴力法
    - 解释：遍历每一个数组，直到遍历所有元素
    - 时间复杂度：O(n^2^)
    - 空间复杂度：O(1)
- (2)按列二分查找
    - 解释：从左到右（或从右到左），每一列进行二分查找，直到找到元素。
    - 时间复杂度：O(nlogn)
    - 空间复杂度：O(1)
- (3)从左下开始查找
    - 解释：先从左下角元素开始，如果该元素大于target，则往上找，如果该元素小于target，则往右找
    - 时间复杂度：O(w+h)
    - 空间复杂度：O(1)

**题解代码**

[Topic1.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic1.java)

### 2.替换空格 ###

**题目描述**

请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

**题解思路**
- 暴力法
    - 解释：先从前往后遍历字符串数组，确定空格个数，然后用一个新的数组，大小是旧数组大小+空格个数*2，然后从前往后遍历旧数组，遇到空格则追加"%20"，非空格则追加字符，最后输出。
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    
**代码题解**
[Topic2.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic2.java)

    