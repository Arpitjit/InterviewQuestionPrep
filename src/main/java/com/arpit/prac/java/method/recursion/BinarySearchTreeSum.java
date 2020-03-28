package com.arpit.prac.java.method.recursion;

import com.sun.org.apache.regexp.internal.RE;

public class BinarySearchTreeSum {


    public TreeNode searchBST(TreeNode root, int val) {



        return searchBSTAlgo(root, val);




    }

    private TreeNode searchBSTAlgo(TreeNode root, int val) {

        if(null == root){
            return null;
        }

        if(root.val == val){
            return root;
        }

        if(val < root.val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }

    }


}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

