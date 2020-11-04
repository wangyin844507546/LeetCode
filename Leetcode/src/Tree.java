import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Wang Yin
 * @date 2020/11/4 16:10
 */
public class Tree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    /**
     *
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                list.add(queue.poll().val);
            }
        }

        return res;
    }
}
