package com.jianzhioffer.kthNode;

public class Solution {
    private int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode treeNode = KthNode(pRoot.left, k);
            if (treeNode != null) {
                return treeNode;
            }
            index++;
            if (index == k) {
                return pRoot;
            }
            treeNode = KthNode(pRoot.right, k);
            if (treeNode != null) {
                return treeNode;
            }
        }
        return null;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
