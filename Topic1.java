
/**
 *	1.二维数组中的查找
 *	题目描述:在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 *	输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Topic1 {

    /**
     * 暴力破解
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     **/
    private boolean find1(int target, int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 按列二分查找
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(1)
     **/
    public boolean find2(int target, int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int j = 0; j < array[0].length; j++) {
            int start = 0;
            int end = array.length - 1;
            while (end >= start) {
                int middle = (end + start) / 2;
                if (array[middle][j] == target) {
                    return true;
                } else if (array[middle][j] < target) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return false;
    }

    /**
     * 左下向右上遍历
     * 时间复杂度：O(W+H)
     * 空间复杂度：O(1)
     */
    public boolean find3(int target, int [][] array) {
        int rows = array.length;
        if(rows == 0){
            return false;
        }
        int cols = array[0].length;
        if(cols == 0){
            return false;
        }
        // 先获取左下角元素，然后判断它是否大于target，如果大于则在该列往上搜索，否则则继续往右
        int row = rows-1;
        int col = 0;
        while(row>=0 && col<cols){
            if(array[row][col] < target){
                col++;
            }else if(array[row][col] > target){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }
}
