import java.util.HashMap;
import java.util.Map;

/**
 *  跳台阶
 *  题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Topic8 {

    /**
     * 递归（斐波那契数列）
     * 解释：等于前两个结果之和
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(1)
     */
    public int JumpFloor(int target) {
        if(target<=2) {
            return target;
        }
        return JumpFloor(target-1) + JumpFloor(target -2);
    }

    /**
     * 递归优化
     * 解释：等于前两个结果之和，每次从缓存拿结果，拿不到再递归计算
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    private Map<Integer, Integer> map = new HashMap<>();
    public int JumpFloor1(int target) {
        if(target<=2) {
            return target;
        }
        if (map.get(target - 1) == null) {
            map.put(target - 1, JumpFloor1(target-1));
        }
        if (map.get(target - 2) == null) {
            map.put(target - 2, JumpFloor1(target-2));
        }
        return map.get(target - 1) + map.get(target - 2);
    }

    /**
     * 动态规划
     * 解释：跟斐波那契数列数列一样，可以求最优解
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int JumpFloor2(int target) {
        if(target<=2) {
            return target;
        }
        int last1 = 2;
        int last2 = 1;
        while(target-->2) {
            last1 = last1 + last2;
            last2 = last1 - last2;
        }
        return last1;
    }
}
