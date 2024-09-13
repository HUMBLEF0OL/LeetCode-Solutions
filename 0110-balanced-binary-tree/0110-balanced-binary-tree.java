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
    public int findHeight(TreeNode root){
        if(root == null)return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        boolean left = isBalanced(root.left);
        if(!left)return false;
        boolean right = isBalanced(root.right);
        if(!right)return false;
        int leftSide = findHeight(root.left);
        int rightSide = findHeight(root.right);
        return Math.abs(leftSide-rightSide) <= 1;
    }
}