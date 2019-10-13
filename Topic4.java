import java.util.Arrays;

/**
 *
 *重建二叉树
 * 题目描述：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Topic4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 递归
     * 解释：前序遍历获取到的第一个元素就是根结点，找到根结点在中序遍历中的位置i，则位置i左边的元素都是根结点的左子树，位置i右边的元素都是根结点的右子树，所以前序遍历的第1个元素就是左子树结点，前序遍历的第i+1个元素就是右子树结点，然后如此递归遍历即可。
     * 时间复杂度：O(n)。只需要遍历n个结点即可完成。
     * 空间复杂度：O(n)。额外申请了n个元素的空间。
     *
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i=0; i<in.length; i++) {
            if (in[i] == pre[0]) {
                // 命中
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
            }
        }
        return node;
    }
}
