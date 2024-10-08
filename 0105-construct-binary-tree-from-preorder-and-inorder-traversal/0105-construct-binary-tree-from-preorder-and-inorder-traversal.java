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
    private int index = 0;
    public TreeNode helper(int[] preorder,int[] inorder,int start,int end){
        if( start > end)return null;
        
        TreeNode root = new TreeNode(preorder[index++]);
        if(start == end)return root;
        
        int i =start;
        while(start<end && inorder[i] != root.val)i++;
        root.left = helper(preorder,inorder,start,i-1);
        root.right = helper(preorder,inorder,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,preorder.length-1);
    }
}