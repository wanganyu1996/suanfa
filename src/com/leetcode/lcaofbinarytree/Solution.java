package com.leetcode.lcaofbinarytree;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        final TreeNode left = lowestCommonAncestor(root.left,p,q);
        final TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null&&right!=null){
            return root;
        }else{
            return left == null ? right : left;
        }

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
