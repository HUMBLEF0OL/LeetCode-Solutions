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
    List<String> result = new ArrayList<>();
    public void helper(TreeNode root,String path){
        if(root == null){
            return;
        } else if(root.left == null && root.right == null){
            result.add(path+String.valueOf(root.val));
            return;
        }
        path += String.valueOf(root.val)+"->";
        helper(root.left,path);
        helper(root.right,path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)return result;
        
        helper(root,"");
        return result;
    }
}