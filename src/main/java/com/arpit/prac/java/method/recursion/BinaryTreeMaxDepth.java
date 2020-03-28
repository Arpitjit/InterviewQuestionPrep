package com.arpit.prac.java.method.recursion;

public class BinaryTreeMaxDepth {


     // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public int maxDepth(TreeNode root) {
            int i = 0;

            return maxDepth(root, 1);

        }

        private int maxDepth(TreeNode root, int i) {

            if(root==null){
                return 0;
            }
            i++;

            return Integer.max(maxDepth(root.left, i), maxDepth(root.right, i));
        }


    }
}
