public class Topic16{

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 非递归法
     * 解释：遍历list2中到每一个结点，然后插入到list1中
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        // 前结点
        ListNode preNode = null;
        // 当前结点
        ListNode curNode = list1;
        while(curNode != null) { //当当前结点不为空
            // 如果list2的结点为空，则直接返回list1
            if(list2 == null) {
                break;
            }
            // 当list2的值小于当前结点的值
            if(list2.val < curNode.val) {
                // 缓存这个要插入的结点
                ListNode insertNode = list2;
                // 后移list2
                list2 = list2.next;
                // 并将要插入结点插到list1中
                insertNode.next = curNode;
                // preNode的next指向插入结点
                preNode.next = insertNode;
                // preNode后移
                preNode = insertNode;
                // 退出本次循环，继续遍历list2，避免重复值被错过
                continue;
            }
            // 当不进行插入，preNode和curNode都后移
            preNode = curNode;
            curNode = curNode.next;
        }
        if(curNode == null && preNode != null) {
            // 当curNode为空时，将list1的最后结点连接到剩余的list2中
            preNode.next = list2;
        }
        // 返回list1
        return list1;
    }

    /**
     * 递归法
     * 解释：list1中每一个结点的next都依赖下一次merge返回的结果
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge2(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge2(list1, list2.next);
            return list2;
        }
    }
}
