/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        //if diameter passes through root
        int h1=height(root.left);
        int h2=height(root.right);
        //if it is in left subtree
        int d1=diameterOfBinaryTree(root.left);
        //if it is in right subtree
        int d2=diameterOfBinaryTree(root.right);
        return Math.max(Math.max(d1,d2),(h1+h2));
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return 1+Math.max(l,r);
    }
}
