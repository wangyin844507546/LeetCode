package algorithm.dynamicProgram.rob;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wang Yin
 * @date 2022/6/26 19:19\
 * 337. 打家劫舍 III
 * 小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为 root 。
 * 除了 root 之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
 * 如果 两个直接相连的房子在同一天晚上被打劫 ，房屋将自动报警。
 *
 * 给定二叉树的 root 。返回 在不触动警报的情况下 ，小偷能够盗取的最高金额 。
 */
public class rob3 {

    Map<TreeNode,Integer> memo = new HashMap<>();

    public int rob(TreeNode treeNode){
        if (treeNode == null)
            return 0;

        if (memo.containsKey(treeNode))
            return memo.get(treeNode);

        int result = Math.max(treeNode.val +
                (treeNode.left == null ? 0: rob(treeNode.left.left) + rob(treeNode.left.right)) +
                        (treeNode.right == null ? 0: rob(treeNode.right.left) + rob(treeNode.right.right))
                , rob(treeNode.left) + rob(treeNode.right));

        memo.put(treeNode,result);
        return result;

    }

}
