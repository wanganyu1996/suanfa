package com.jianzhioffer.lowestCommonAncestorOfBinaryTree;

public class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null || root==p || root==q){
           return root;
       }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null&&right!=null){
            return root;
        }
        return left!=null?left:right;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static TreeNode getLastCommonNode(TreeNode pRoot, TreeNode pLeft, TreeNode pRight){
        TreeNode treeNode = null;
        if(pRoot == null || pLeft.val > pRight.val){
            return null;
        }
        if(pRoot.val >= pRight.val){
            treeNode = getLastCommonNode(pRoot.left, pLeft, pRight);
        }
        if(pRoot.val <= pLeft.val){
            treeNode = getLastCommonNode(pRoot.right, pLeft, pRight);
        }
        if(pRoot.val >= pLeft.val && pRoot.val <= pRight.val){
            return pRoot;
        }
        return treeNode;
    }

}
