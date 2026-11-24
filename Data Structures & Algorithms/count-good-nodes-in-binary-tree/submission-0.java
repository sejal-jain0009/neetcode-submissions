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
    int count=0;
    public int goodNodes(TreeNode root) {
        return solve(root,root.val);
    }
    public int solve(TreeNode root,int maxval)
    {
        if(root==null) return 0;
        if(root.val>=maxval) count++;
        int newval=Math.max(root.val,maxval);
        solve(root.left,newval);
        solve(root.right,newval);
        return count;
    }
}
