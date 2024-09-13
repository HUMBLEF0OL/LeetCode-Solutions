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
class Pair{
    boolean isBalance;
    int height;
    public Pair(boolean isBalance, int height){
        this.isBalance = isBalance;
        this.height = height;
    }
}
class Solution {
    
    public Pair optimized(TreeNode root){
        if(root == null)return new Pair(true,0);
        Pair left = optimized(root.left);
        Pair right = optimized(root.right);
        
        int height = Math.max(left.height,right.height)+1;
        boolean isBalanced = left.isBalance && right.isBalance && Math.abs(left.height - right.height) <= 1;
        return new Pair(isBalanced,height);
        
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        
        return optimized(root).isBalance;
    }
}