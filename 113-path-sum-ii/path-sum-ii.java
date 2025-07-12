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
    List<List<Integer>>result=new ArrayList<>();
    Stack<Integer>s=new Stack<>();
    private void Sum(TreeNode root, int targetSum,int sum){
        if(root==null){
            return ;
        }
        s.push(root.val);
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
           if(sum==targetSum){
                result.add(new ArrayList<>(s));
           }
        }
           else{
             Sum(root.right,targetSum,sum);
             Sum(root.left,targetSum,sum);
           }
           s.pop();
        }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum=0;
        Sum(root,targetSum,sum);
        return result;
    }
}