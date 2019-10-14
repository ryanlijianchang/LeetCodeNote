import java.util.HashMap;
import java.util.Map;

/**
 * 矩形覆盖
 * 题目描述：
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Topic10 {
    /**
     * 递归（斐波那契数列）
     * 解释：当target<=2时，种数就是target；当n>2时，当前的种数就是n-2时再竖着放两条 + n-1时再横着放一条
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(1)
     */
    public int RectCover(int target) {
        if(target <= 2) {
            return target;
        }
        return RectCover(target-1) + RectCover(target-2);
    }

    /**
     * 优化版递归
     * 解释：等于前两个结果之和，每次从缓存拿结果，拿不到再递归计算
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    private Map<Integer, Integer> resultMap = new HashMap<>();
    public int RectCover1(int target) {
        if(target <= 2) {
            return target;
        }
        if (resultMap.get(target-1) == null) {
            resultMap.put(target-1, RectCover1(target-1));
        }
        if (resultMap.get(target-2) == null) {
            resultMap.put(target-2, RectCover1(target-2));
        }
        return resultMap.get(target-1) + resultMap.get(target-2);
    }

    /**
     * 动态规划
     * 解释：跟斐波那契数列数列一样，可以求最优解
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int RectCover2(int target) {
        if(target <= 2) {
            return target;
        }
        int last1 = 1;
        int last2 = 1;
        while(target-->2) {
            last1 = last1 + last2;
            last2 = last1 - last2;
        }
        return last1;
    }
}
