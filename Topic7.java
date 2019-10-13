public class Topic7 {

    /**
     * 递归
     * 解释：斐波那契数列第1，2项为1，第n项为第n-1和第n-2之和，所以可以用递归计算
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(1)
     */
    public int Fibonacci(int n) {
        if (n==0) {
            return 0;
        }
        if(n==1 || n==2) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    /**
     * 优化递归
     * 解释：由于递归会重复计算同一个数值，所以造成了时间复杂度过高，可以用一个数据缓存数据避免重复计算
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    private int[] results = new int[32];
    public int Fibonacci1(int n) {
        if (n==0) {
            return 0;
        }
        if(n==1 || n==2) {
            return 1;
        }
        if(results[n-1] == 0) {
            results[n-1] = Fibonacci1(n-1);
        }
        if(results[n-2] == 0) {
            results[n-2] = Fibonacci1(n-2);
        }
        return results[n-1] + results[n-2];
    }

    /**
     * 动态规划
     * 解释：这个问题满足动态规划的三个特征：
     *  1.最优子结构：后面的状态可以依赖前面的状态推导出来
     *  2.无后效性：推导当前状态只关心前面的状态结果，不关心推导过程
     *  3.重复子问题：计算某个值的时候，会产生大量重复子问题
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int Fibonacci2(int n) {
        int last1 = 0;
        int last2 = 1;
        while(n-->0) {
            last1 = last1 + last2;
            last2 = last1 - last2;
        }
        return last1;
    }
}
