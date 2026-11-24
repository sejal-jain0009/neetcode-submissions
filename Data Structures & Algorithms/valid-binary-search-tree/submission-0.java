class Solution {
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean solve(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(root.val <= min || root.val >= max)
            return false;
        if(!solve(root.left, min, root.val)) return false;
        if(!solve(root.right, root.val, max)) return false;
        return true;
    }
}