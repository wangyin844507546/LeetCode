package Structure;

/**
 * @Author Wang Yin
 * @Date 2021/8/15 11:32
 */
public class TreeNode {

     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode() {}
     public TreeNode(int val) { this.val = val; }
     public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

}
