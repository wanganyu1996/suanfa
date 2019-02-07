package com.jianzhioffer.printNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList root = new ArrayList<ArrayList<Integer>>();

        if (pRoot == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int nextLevel = 1;
        int toBePrinted = 0;
        List list = new ArrayList<Integer>();
        while (!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            list.add(temp.val);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            toBePrinted++;
            if (toBePrinted == nextLevel) {
                toBePrinted = 0;
                nextLevel = queue.size();
                root.add(list);
                list = new ArrayList();
            }
        }
        return root;
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
