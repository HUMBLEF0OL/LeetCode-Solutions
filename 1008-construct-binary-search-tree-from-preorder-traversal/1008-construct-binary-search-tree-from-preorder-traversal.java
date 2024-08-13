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
    // index
    int index = 0;
    public TreeNode helper(int arr[],int bound){
        // when array is completely traveresed or the current element is out of bound
        if(index == arr.length || arr[index] > bound)return null;
        
        TreeNode root = new TreeNode(arr[index++]);
        root.left = helper(arr,root.val);
        root.right = helper(arr,bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        // maintain a bound parameter
        return helper(preorder,Integer.MAX_VALUE);
    }
}