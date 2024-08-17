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
    public void flatten(TreeNode root) {
        if(root == null)return;
        if(root.left == null && root.right == null)return;
        flatten(root.left);
        flatten(root.right);
        TreeNode newRight = root.left;
        if(root.left != null){
            root.left = null;
            // traverse the last node of original left 
            TreeNode dummy = newRight;
            
            while(dummy.right !=null)dummy = dummy.right;
            
            dummy.right = root.right;
            root.right = newRight;
        }
        
    }
}