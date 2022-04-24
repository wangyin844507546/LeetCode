package structure.binaryTree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/8/15 22:17
 * 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */
public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            inorderTraversal(root,list);
            return list;
        }

        public static void inorderTraversal(TreeNode root,List<Integer> list) {
            if (root != null) {
                inorderTraversal(root.left,list);
                list.add(root.val);
                inorderTraversal(root.right,list);
            }
    }
}
