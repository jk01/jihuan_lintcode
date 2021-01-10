package com.algorithm.tree2;

import com.algorithm.link.TreeNode;

public class TreeUpsideDownBinaryTree {
    TreeNode dfs(TreeNode cur) {
        if (cur.left == null) {
            return cur;
        }
        TreeNode newRoot = dfs(cur.left);
        cur.left.right = cur;
        cur.left.left = cur.right;
        cur.left = null;            // important
        cur.right = null;
        return newRoot;
    }

    public TreeNode upsideDownBinaryTree(TreeNode root) {
        // Write your code here
        if (root == null) {
            return null;
        }
        return dfs(root);
    }
}
