import java.util.Arrays;

/**
 * 变态跳台阶
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Topic9 {

    /**
     * 斐波那契数列变种
     * 解释：之前的斐波那契数列都是每次只能跳有限的次数，所以本次的值就等于有限的跳法相加，当一次能跳n种时，我们可以通过求前面所有的跳法之和再加1即可
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public int JumpFloorII2(int target) {
        int[] result = new int[target + 1];
        Arrays.fill(result, 1);
        result[0] = 0;
        for (int i=1;i<result.length;i++) {
            for (int j=i-1;j>0;j--) {
                result[i] += result[j];
            }
        }
        return result[target];
    }

    /**
     * 公式法
     * 解释：
     * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(1)
     * f(n-1) = f(n-2) + f(n-3) + ... + f(1);
     * 两式相减 f(n) = 2 * f(n-1)
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int JumpFloorII(int target) {
        if(target<=2) {
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }
}
