/**
 * 数值的整数次方
 * 题目描述：
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */

public class Topic12 {
    /**
     * 累乘
     * 解释：先判断指数是正数或者负数，然后取正数进行累乘，然后判断如果指数是负数返回1/该数值
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param base 底数
     * @param exponent 指数
     */
    public double Power(double base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        boolean isPositive = exponent > 0;
        exponent = isPositive ? exponent : -exponent;
        double result = base;
        while((exponent--) > 1) {
            result *= base;
        }
        return isPositive ? result : (1 / result);
    }
}
