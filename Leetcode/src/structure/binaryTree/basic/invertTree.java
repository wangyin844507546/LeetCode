package structure.binaryTree.basic;

import common.TreeNode;

/**
 * @Author Wang Yin
 * @Date 2021/8/28 15:28
 * 翻转二叉树
 *输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 */
public class invertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode rootLeft = invertTree(root.left);
        TreeNode rootRight = invertTree(root.right);
        TreeNode temp = root.right;
        root.right = rootLeft;
        root.left = rootRight;
        return root;
    }

}
