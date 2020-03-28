package com.arpit.prac.java.method.recursion;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class BinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        return searchBSTAlgo(root, val);

    }

    private TreeNode searchBSTAlgo(TreeNode root, int val) {

        if (null == root) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }

    }


}
