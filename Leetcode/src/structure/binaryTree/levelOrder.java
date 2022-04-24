package structure.binaryTree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Yin * @date 2021/9/17 19:07
 *  二叉树的层序遍历
 *  DFS 与 BFS
 *  DFS 遍历使用递归：
 *  void dfs(TreeNode root) {
 *     if (root == null) {
 *         return;
 *     }
 *     dfs(root.left);
 *     dfs(root.right);
 * }
 *
 * BFS 遍历使用队列数据结构：
 * void bfs(TreeNode root) {
 *     Queue<TreeNode> queue = new ArrayDeque<>();
 *     queue.add(root);
 *     while (!queue.isEmpty()) {
 *         TreeNode node = queue.poll(); // Java 的 pop 写作 poll()
 *         if (node.left != null) {
 *             queue.add(node.left);
 *         }
 *         if (node.right != null) {
 *             queue.add(node.right);
 *         }
 *     }
 * }
 *
 */
public class levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<TreeNode> treeNodes = new ArrayList<>();
        levelOrder(treeNodes,lists);
        return lists;
    }

    private void levelOrder(List<TreeNode> treeNodes, List<List<Integer>> lists) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i < treeNodes.size(); i++) {
            temp.add(treeNodes.get(i).val);
        }
    }

}
