package structure.binaryTree.idea;


import common.TreeNode;

/**
 * @author Wang Yin
 * @date 2022/5/4 17:15\
 *
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有next 指针都被设置为 NULL。
 *
 */
public class connect {

    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        traverse(root.left,root.right);
        return root;
    }

    public void traverse(TreeNode node1,TreeNode node2){
        if (node1 == null || node2 == null) {
            return;
        }
        node1.next = node2;
        traverse(node1.left,node1.right);
        traverse(node2.left,node2.right);
        traverse(node1.right,node2.left);

    }

}
