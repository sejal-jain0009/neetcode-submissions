class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);  
        return max;  
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int x=Math.max(0,solve(root.left));
        int y=Math.max(0,solve(root.right));
        max=Math.max(root.val+x+y,max);
        return root.val + Math.max(x, y);
    }
}
