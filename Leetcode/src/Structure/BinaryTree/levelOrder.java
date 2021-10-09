package Structure.BinaryTree;

import Structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Yin * @date 2021/9/17 19:07
 *  二叉树的层序遍历
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
            treeNodes
        }
    }

}
