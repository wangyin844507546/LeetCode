package structure.binaryTree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Yin
 * @date 2021/9/17 19:05
 * 二叉树的后序遍历
 */
public class postorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }

    public static void postorderTraversal(TreeNode root,List<Integer> list) {
        if (root != null) {
            postorderTraversal(root.left,list);
            postorderTraversal(root.right,list);
            list.add(root.val);
        }
    }
}
