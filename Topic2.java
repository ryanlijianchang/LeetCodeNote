/**
 *  2.替换空格
 *  题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Topic2 {

    /**
     * 先从前往后计算空格个数，计算新的字符串长度，再从前往后遍历数组，遇到空格则替换
     * 时间复杂度：O（n）
     * 空间复杂度：O(n)
     */
    public String replaceSpace(StringBuffer str) {
        if(str == null || str.length() ==0) {
            return "";
        }
        int blankNum = 0;
        int i=0;
        while(i<str.length()) {
            char c =str.charAt(i);
            if(c==' ') {
                blankNum++;
            }
            i++;
        }
        int newLen = str.length() + blankNum * 2;
        StringBuilder result = new StringBuilder(newLen);
        i=0;
        while(i<str.length()) {
            char c =str.charAt(i);
            if(c != ' ') {
                result.append(c);
            } else {
                result.append("%20");
            }
            i++;
        }
        return result.toString();
    }
}
