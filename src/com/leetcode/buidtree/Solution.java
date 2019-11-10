package com.leetcode.buidtree;

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null){
            return null;
        }
        return buildTree2(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private  TreeNode buildTree2(int [] preorder,int pStart,int pEnd,int inorder[],int iStart,int iEnd){
        if(pStart>pEnd||iStart>iEnd){
            return null;
        }
        int root = preorder[pStart];
        TreeNode rootNode = new TreeNode(root);
        for (int i = iStart; i <=iEnd; i++) {
            if(inorder[i]==root){
                rootNode.left = buildTree2(preorder, pStart + 1, pStart + (i - iStart), inorder, iStart, i - 1);
                rootNode.right = buildTree2(preorder, pStart + (i - iStart) + 1, pEnd, inorder, i+1, iEnd);
            }
        }
        return rootNode;
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