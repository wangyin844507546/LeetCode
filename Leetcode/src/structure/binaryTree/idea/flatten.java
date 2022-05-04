package structure.binaryTree.idea;

import common.TreeNode;

/**
 * @author Wang Yin
 * @date 2022/5/4 17:37\
 * 114. 二叉树展开为链表
 *
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *
 */
public class flatten {

    public void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        // 后续遍历
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode dump = root;
        while (dump.right != null) {
            dump = dump.right;
        }
        dump.right = temp;
    }

}
