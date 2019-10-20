/**
 * 反转链表
 * 题目描述：输入一个链表，反转链表后，输出新链表的表头。
 */
public class Topic15 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    /**
     * 前后指针法
     * 解释：将前指针指向未翻转序列的第一个元素，后指针指向已翻转的最后一个元素，然后将未翻转的第一个元素翻转，重复次操作
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        // origin指向未翻转的第一个元素
        ListNode originHead = head;
        originHead = originHead.next;
        // 将新的链头指向第一个元素，且其next为空
        ListNode newHead = head;
        newHead.next = null;

        while(originHead != null) { //当未翻转序列不为空时执行
            // 用temp指向未翻转序列的第一个元素
            ListNode temp = originHead;
            // origin指向下一个元素，以备下一轮操作
            originHead = originHead.next;
            // 将temp元素翻转
            temp.next = newHead;
            // 新链头指向temp
            newHead = temp;
        }
        // 返回新链头
        return newHead;
    }
}
