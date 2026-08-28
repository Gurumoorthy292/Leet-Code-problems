/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode high;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode high) {
 *         this.val = val;
 *         this.left = left;
 *         this.high = high;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public void rangeSum(TreeNode root, int low, int high)
    {
        if(root == null) return;

        if(root.val >= low && root.val <= high){
            this.sum += root.val;
            rangeSum(root.right, low, high);
            rangeSum(root.left, low, high);
        }
        
        else if(root.val < low)
            rangeSum(root.right, low, high);
        else if(root.val > high)
            rangeSum(root.left, low, high);
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSum(root, low, high);
        return this.sum;
    }
}