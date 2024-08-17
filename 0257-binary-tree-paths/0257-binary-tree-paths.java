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
    List<String> paths = new ArrayList<>();
    public void helper(TreeNode root, String currentPath){
        if(root == null){
            return;
        }
        currentPath += String.valueOf(root.val);
        if(root.left == null && root.right == null){
            paths.add(currentPath);
            return;
        }
        currentPath += "->";
        helper(root.left,currentPath);
        helper(root.right,currentPath);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return paths;
    }
}