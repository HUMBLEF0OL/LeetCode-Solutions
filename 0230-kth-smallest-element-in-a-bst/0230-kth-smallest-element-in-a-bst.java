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
    int count = 0;
    // int value = 0;
    public int helper(TreeNode root,int k)
    {
        if(root == null)return -1;
        // using inorder traversal
        int x = helper(root.left,k);
        if(x!=-1)return x;
        count++;
        if(count == k)return root.val;
        
        
        int y = helper(root.right,k);
        // return 0;
        if(y!=-1)return y;
        return -1;
    }
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k);
        // return value;
    }
}