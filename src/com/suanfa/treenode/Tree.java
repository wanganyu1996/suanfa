package com.suanfa.treenode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.cnblogs.com/zyoung/p/7455916.html
 * 二叉树层次遍历
 */
public class Tree {
    TreeNode last;
    TreeNode nlast;
    public void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        last = root;
        nlast = root;
        while (!queue.isEmpty()) {
            TreeNode t = queue.peek();
            System.out.print(queue.poll().data + " ");
            if (t.left != null) {
                queue.add(t.left);
                nlast = t.left;
            }
            if (t.right != null) {
                queue.add(t.right);
                nlast = t.right;
            }
            // 如果当前输出结点是最右结点，那么换行
            if (last == t) {
                System.out.println();
                last = nlast;
            }
        }
    }

    public static void main(String[] args) {
        // 构建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        Tree test = new Tree();
        test.printTree(root);
    }
}
