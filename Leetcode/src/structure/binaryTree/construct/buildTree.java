package structure.binaryTree.construct;

import common.TreeNode;

/**
 * @author Wang Yin
 * @date 2022/5/15 10:31\
 * 105. 从前序与中序遍历序列构造二叉树
 * 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历，
 * inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 *
 */
public class buildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length - 1,
                inorder,0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder,int preStart, int preEnd,
                          int[] inorder,int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (preorder[preStart] == inorder[i]) {
                index = i;
                break;
            }
        }
        int left = index - inStart;
        root.left = build(preorder,preStart+1,preStart + left,
                                inorder,inStart,index -1);
        root.right = build(preorder,preStart + left + 1, preEnd,
                                inorder,index+1,inEnd);
        return root;
    }

}
