package structure.binaryTree.construct;

import common.TreeNode;

/**
 * @author Wang Yin
 * @date 2022/5/15 10:11\
 *654. 最大二叉树
 *
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 *
 * 创建一个根节点，其值为 nums 中的最大值。
 * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * 返回 nums 构建的 最大二叉树 。
 *
 */
public class constructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return  build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int left, int right) {
        if (left > right)
            return null;
        int index = -1, max = Integer.MIN_VALUE;
        for(int i = left; i <= right; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = build(nums,left,index-1);
        root.right = build(nums,index+1,right);
        return root;
    }

}
