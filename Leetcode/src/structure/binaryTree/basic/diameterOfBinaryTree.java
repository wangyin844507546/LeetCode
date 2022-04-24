package structure.binaryTree.basic;

import common.TreeNode;

/**
 * @author Wang Yin
 * @date 2022/3/13 19:50
 *
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 */
public class diameterOfBinaryTree {

    public static int maxDiameter = 0;


    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        maxDepth(root);
        return maxDiameter;
    }

    public static int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter,leftMax+rightMax);
        return 1 + Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        TreeNode letfNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(2);
        TreeNode root = new TreeNode(1,letfNode,null);
        int diameter = diameterOfBinaryTree(root);
            System.out.println(diameter);
    }
}
