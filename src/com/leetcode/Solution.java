package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * <p>
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * }
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int levelSize = 0;
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = queue.poll();
                levelList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            list.add(levelList);
        }
        return list;
    }
}
/**
 * import java.util.*;
 * class Solution {
 * public List<List<Integer>> levelOrder(TreeNode root) {
 * List<List<Integer>> l=new ArrayList<List<Integer>>();
 * if(root==null){
 * return l;
 * }
 * Queue<TreeNode> queue=new LinkedList<TreeNode>();
 * queue.offer(root);
 * while(!queue.isEmpty()){
 * int levelSize=queue.size();
 * List list=new LinkedList<Integer>();
 * for(int i=0;i<levelSize;i++){
 * TreeNode r=queue.poll();
 * list.add(r.val);
 * if(r.left!=null){
 * queue.offer(r.left);
 * }
 * if(r.right!=null){
 * queue.offer(r.right);
 * }
 * }
 * l.add(list);
 * }
 * return l;
 * }
 * }
 **/