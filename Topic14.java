/**
 * 链表中倒数第k个结点
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 */
public class Topic14 {

    /**
     * 常规法
     * 解释：先遍历获取长度，再计算倒数第k个位置对应顺数的位置
     * 时间复杂度：O(n)
     * 空间负载度：O(1)
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        int len=0;
        ListNode currentNode = head;
        while(currentNode != null) {
            len++;
            currentNode = currentNode.next;
        }
        int goal = len - k + 1;
        int i = 1;
        while(head != null) {
            if(i == goal) {
                return head;
            }
            head = head.next;
            i++;
        }
        return null;
    }

    /**
     * 快慢指针法
     * 解释：使快指针比慢指针领先k个位置，这样快指针和慢指针的距离就是k，然后让快慢指针同时后移，直至quickNode到队尾，这时慢指针就是从后向前的第k个位置。
     *      注意边界case判断
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode FindKthToTail1(ListNode head,int k) {
        ListNode quickNode = head;
        ListNode slowNode = head;
        for(int i=0;i<k;i++) {
            if(quickNode == null) {
                return null;
            }
            quickNode = quickNode.next;
        }
        while(quickNode != null) {
            quickNode = quickNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
