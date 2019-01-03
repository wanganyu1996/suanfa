package com.jianzhioffer.lowestCommonAncestorOfBinaryTree;


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        List<TreeNode> path1 = new ArrayList<>(), path2 = new ArrayList<>();
        getNodePath(root, p, path1);
        getNodePath(root, q, path2);
        return getLastCommonNode(path1, path2);
    }

    public TreeNode getLastCommonNode(List<TreeNode> path1, List<TreeNode> path2) {
        TreeNode pLast = null;
        for (int i = 0, k = 0; i <path1.size() && k <path2.size(); i++, k++) {
            if (path1.get(i) == path2.get(k)) {
                pLast = path1.get(i);
            }
        }
        return pLast;
    }

    public void getNodePath(TreeNode pRoot, TreeNode pNode, List<TreeNode> path) {
        if (pRoot == null) {
            return;
        }
        if (pRoot == pNode) {
            path.add(pRoot);
            return;
        }
        path.add(pRoot);
        if (pRoot.left != null) {
            getNodePath(pRoot.left, pNode, path);
        }
        if (pRoot.right != null) {
            getNodePath(pRoot.right, pNode, path);
        }
        path.remove(path.size() - 1);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
