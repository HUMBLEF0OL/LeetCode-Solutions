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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>0){
            TreeNode current = q.remove();
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
            if(q.peek() == null){
                result.add(current.val);
                q.add(q.remove());
                if(q.size() == 1)break;
            }
        }
        return result;
    }
}