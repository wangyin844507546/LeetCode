package Structure.BinaryTree;

import TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Yin
 * @date 2021/9/17 18:42
 * 二叉树的前序遍历
 */
public class preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }

    public static void preorderTraversal(TreeNode treeNode,List<Integer> list) {
        if (treeNode != null) {
            list.add(treeNode.val);
            preorderTraversal(treeNode.left,list);
            preorderTraversal(treeNode.right,list);
        }
    }
}
