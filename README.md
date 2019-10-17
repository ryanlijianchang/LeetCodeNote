### 1.二维数组中的查找 ###

**题目描述**

在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

**题解思路**

- (1)暴力法
    - 解释：遍历每一个数组，直到遍历所有元素
    - 时间复杂度：O(n^2)
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

---

### 2.替换空格 ###

**题目描述**

请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

**题解思路**
- (1)暴力法
    - 解释：先从前往后遍历字符串数组，确定空格个数，然后用一个新的数组，大小是旧数组大小+空格个数*2，然后从前往后遍历旧数组，遇到空格则追加"%20"，非空格则追加字符，最后输出。
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
    
**题解代码**
[Topic2.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic2.java)


---

### 3.从尾到头打印链表 ###

**题目描述**

输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

**题解思路**

- (1)栈
    - 解释：要实现倒序输出，其实就是利用了栈的先进后出的思想。
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)
- (2)递归
    - 解释：任何用栈实现的算法，都是可以用递归来实现，可以理解成每一次插入元素都是在后一个元素已经插入的基础上进行。
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)

**题解代码**

[Topic3.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic3.java)

---

### 4.重建二叉树 ###

**题目描述**

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

**题解思路**

- (1)递归
    - 解释：前序遍历获取到的第一个元素就是根结点，找到根结点在中序遍历中的位置i，则位置i左边的元素都是根结点的左子树，位置i右边的元素都是根结点的右子树，所以前序遍历的第1个元素就是左子树结点，前序遍历的第i+1个元素就是右子树结点，然后如此递归遍历即可。
    - 时间复杂度：O(n)。只需要遍历n个结点即可完成。
    - 空间复杂度：O(n)。额外申请了n个元素的空间。
    

**题解代码**

[Topic4.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic4.java)

---


### 5.用两个栈实现队列 ###

**题目描述**

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。


**题解思路**

- (1)双栈
    - 解释：栈B用来出队列，当栈B为空时，栈A全部出栈到栈B,栈B再出栈（即出队列）
    - 平均时间复杂度：O(1)
    - 空间复杂度：O(1)

**题解代码**

[Topic5.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic5.java)

---

### 6.旋转数组的最小数字 ###

**题目描述**

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。


**题解思路**

- (1)优化版暴力法
    - 解释：从前往后搜索第一个大于前者的数，如果搜索不到返回第一个元素
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)
    
- (2)二分查找法
    - 解释：通过二分方式，寻找前元素大于后元素并且位置相差为1的元素，如果搜索不到返回第一个元素
    - 时间复杂度：O(log2n)
    - 空间复杂度：O(1)

**题解代码**

[Topic6.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic6.java)

---

### 7.斐波那契数列 ###

**题目描述**

大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39

**题解思路**

- (1)递归
    - 解释：斐波那契数列第1，2项为1，第n项为第n-1和第n-2之和，所以可以用递归计算
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(1)
    
- (2)优化递归
    - 解释：由于递归会重复计算同一个数值，所以造成了时间复杂度过高，可以借助数组缓存计算结果，避免重复计算
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)

- (3)动态规划
    - 解释：这个问题满足动态规划的三个特征：
        - 1.最优子结构：后面的状态可以依赖前面的状态推导出来
        - 2.无后效性：推导当前状态只关心前面的状态结果，不关心推导过程
        - 3.重复子问题：计算某个值的时候，会产生大量重复子问题
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)

**题解代码**

[Topic7.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic7.java)

---

### 8.跳台阶 ###

**题目描述**

一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

**题解思路**

- (1)递归（斐波那契数列）
    - 解释：等于前两个结果之和
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(1)
    
- (2)优化递归
    - 解释：等于前两个结果之和，每次从缓存拿结果，拿不到再递归计算
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)

- (3)动态规划
    - 解释：跟斐波那契数列数列一样，可以求最优解
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)

**题解代码**

[Topic8.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic8.java)

---

### 9.变态跳台阶 ###

**题目描述**

一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

**题解思路**

- (1)递归（斐波那契数列变种）
    - 解释：之前的斐波那契数列都是每次只能跳有限的次数，所以本次的值就等于有限的跳法相加，当一次能跳n种时，我们可以通过求前面所有的跳法之和再加1即可
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(1)
    
- (2)公式法
    - 解释：
        - f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(1)
        - f(n-1) = f(n-2) + f(n-3) + ... + f(1);
        - 两式相减 f(n) = 2 * f(n-1)
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)


**题解代码**

[Topic9.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic9.java)


---

### 10.矩形覆盖 ###

**题目描述**

我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

**题解思路**

- (1)递归（斐波那契数列）
    - 解释：当target<=2时，种数就是target；当n>2时，当前的种数就是n-2时再竖着放两条 + n-1时再横着放一条
    - 时间复杂度：O(2^n)
    - 空间复杂度：O(1)
    
- (2)优化递归
    - 解释：等于前两个结果之和，每次从缓存拿结果，拿不到再递归计算
    - 时间复杂度：O(n)
    - 空间复杂度：O(n)

- (3)动态规划
    - 解释：跟斐波那契数列数列一样，可以求最优解
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)

**题解代码**

[Topic10.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic10.java)

---

### 11.二进制中1的个数 ###

**题目描述**

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

**题解思路**

- (1)与操作计算
    - 解释：机器中存储的就是数字的补码，所以无须考虑符号位。判断最右边第一个1的方法，将数字-1（相当于补码-1），和本数字相与，赋值给该值，每次可以消掉一个1。重复操作，计算次数，即为1出现的次数。
    例如机器识别出来的某一个数字，其补码为 111000，如果我们需要识别最后一个1，那么就可以将补码-1，得到110111，将两数进行与操作，
    即111000 & 110111，等于110000。如此一来，最后一个1就被消掉，如此重复操作，直到该数变成000000，即十进制的0。
    我们计算重复的次数，即为1出现的次数。
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)

**题解代码**

[Topic11.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic11.java)

---

### 12.数值的整数次方 ###

**题目描述**

给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为0

**题解思路**

- (1)累乘
    - 解释：先判断指数是正数或者负数，然后取正数进行累乘，然后判断如果指数是负数返回1/该数值。
    - 时间复杂度：O(n)
    - 空间复杂度：O(1)

- (2)快速幂运算
    - 解释：指数转换为二机制数后，判断1的个数和位置，不断因为累乘
    - 时间复杂度：O(log2n)
    - 空间复杂度：O(1)

**题解代码**

[Topic12.java](https://github.com/ryanlijianchang/SwordOfferCode/blob/master/Topic12.java)

