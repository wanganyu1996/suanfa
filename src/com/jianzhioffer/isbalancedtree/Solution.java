package com.jianzhioffer.isbalancedtree;

import com.suanfa.treenode.TreeNode;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = getDepth(root.left);
        if(left==-1){
            return -1;
        }
        int right = getDepth(root.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

    /**
     * 链接：https://www.nowcoder.com/questionTerminal/8b3b95850edb4115918ecebdf1b4d222
     * 来源：牛客网
     *
     * public class Solution {
     *     public boolean IsBalanced_Solution(TreeNode root) {
     *         return getDepth(root) != -1;
     *     }
     *
     *     private int getDepth(TreeNode root) {
     *         if (root == null) return 0;
     *         int left = getDepth(root.left);
     *         if (left == -1) return -1;
     *         int right = getDepth(root.right);
     *         if (right == -1) return -1;
     *         return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
     *     }
     * }
     *
     *
     *
     *
     * 链接：https://www.nowcoder.com/questionTerminal/8b3b95850edb4115918ecebdf1b4d222
     * 来源：牛客网
     *
     *   private boolean isBalanced=true;
     *     public boolean IsBalanced_Solution(TreeNode root) {
     *
     *         getDepth(root);
     *         return isBalanced;
     *     }
     *     public int getDepth(TreeNode root){
     *         if(root==null)
     *             return 0;
     *         int left=getDepth(root.left);
     *         int right=getDepth(root.right);
     *
     *         if(Math.abs(left-right)>1){
     *             isBalanced=false;
     *         }
     *         return right>left ?right+1:left+1;
     *
     *     }
     */
}

