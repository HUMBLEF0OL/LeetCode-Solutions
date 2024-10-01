/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val)return root;
        
        TreeNode leftSide = lowestCommonAncestor(root.left,p,q);
        TreeNode rightSide = lowestCommonAncestor(root.right,p,q);
        
        if(leftSide != null && rightSide != null)return root;
        
        return leftSide != null ? leftSide : rightSide;
    }
}