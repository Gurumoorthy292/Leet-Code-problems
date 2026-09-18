/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode l;
 *     TreeNode r;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode l, TreeNode r) {
 *         this.val = val;
 *         this.l = l;
 *         this.r = r;
 *     }
 * }
 */
class Solution {

    public boolean dfs(TreeNode l , TreeNode r)
    {
        if(l == null && r == null) return true;

        if(l == null || r == null) return false;

        return l.val == r.val && dfs(l.left , r.right) && dfs(l.right , r.left);
    }

    public boolean isSymmetric(TreeNode root) 
    {
        return dfs(root.left , root.right);
    }
}