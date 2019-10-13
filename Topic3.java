import java.util.ArrayList;
import java.util.Stack;

/**
 *  3.从尾到头打印链表
 *  输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Topic3 {
    public class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 栈实现
     * 解释：要实现倒序输出，其实就是利用了栈的先进后出的思想。
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode cur = listNode;
        while(cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        while(!stack.empty()) {
            result.add(stack.pop());
        }
        return result;
    }

    /**
     * 递归
     * 解释：任何用栈实现的算法，都是可以用递归来实现，可以理解成每一次插入元素都是在后一个元素已经插入的基础上进行。
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if(listNode != null) {
            printListFromTailToHead2(listNode.next);
            result.add(listNode.val);
        }
        return result;
    }
}
