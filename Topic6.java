/**
 * 旋转数组的最小数字
 * 题目描述：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Topic6 {

    /**
     * 优化版暴力法
     * 解释：从前往后搜索第一个大于前者的数，如果搜索不到返回第一个元素
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int minNumberInRotateArray1(int [] array) {
        for(int i=0;i<array.length; i++) {
            if(i!=0 && array[i] < array[i-1]) {
                return array[i];
            }
        }
        if(array.length > 0) {
            return array[0];
        }
        return 0;
    }

    /**
     * 二分查找法
     * 解释：通过二分方式，寻找前元素大于后元素并且位置相差为1的元素
     * 时间复杂度：O(log2n)
     * 空间复杂度：O(1)
     */
    public int minNumberInRotateArray2(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int start = 0;
        int end  = array.length - 1;
        while(array[start] >= array[end]) {
            if (end - start == 1) {
                return array[end];
            }
            int middle = (end + start) / 2;
            if (array[middle] >= array[start]) {
                start = middle;
            }
            if (array[middle] <= array[end]) {
                end = middle;
            }
        }
        return array[start];
    }

}
