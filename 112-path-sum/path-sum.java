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

    public boolean Sum(TreeNode root, int targetSum, int sum){
        if(root == null) return false;

        if(root.left == null && root.right == null){
            sum += root.val;
            if(sum==targetSum){
                return true;
            }
        }
        return Sum(root.left, targetSum,root.val + sum )  || Sum(root.right, targetSum, root.val + sum);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return Sum(root, targetSum, sum);
    }
}