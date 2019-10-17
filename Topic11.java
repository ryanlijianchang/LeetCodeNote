/**
 * 二进制中1的个数
 * 题目描述：
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 *
 * 普及一下概念：
 * 原码：将正数转为二进制的表现形式，首位表示符号，0表示正数，1表示负数。注：原码是人类理解的编码，不适合机器识别
 * 反码：正数的反码就是原码。如果是负数，除了符号位，将原码的其他位取反即为反码。注：反码的存在是为了让机器能够更加简单地实现加法运算
 * 补码：正数的补码就是原码。如果是负数，将反码+1即为补码。注：补码的存在是为了让机器既能方便地实现加法运算，同时避免反码会出现的+0和-0的问题。所以机器使用的是补码。
 *
 */
public class Topic11 {

    /**
     * 位运算
     * 解释：我们都知道机器能直接识别的就是补码，所以无须我们将十进制进行转为二机制计算，而是直接用位运算符号。
     *      那么应该怎么算呢？
     *      举个例子，例如机器识别出来的某一个数字，其补码为 111000，如果我们需要识别最后一个1，那么就可以将补码-1，得到110111，将两数进行与操作，
     *      即111000 & 110111，等于110000。
     *      如此一来，最后一个1就被消掉，如此重复操作，直到该数变成000000，即十进制的0。
     *      我们计算重复的次数，即为1出现的次数。
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
