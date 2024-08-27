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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)return result;
        List<Integer> levelElements = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode head = queue.remove();
            levelElements.add(head.val);
            if(head.left != null){
                queue.add(head.left);
            }
            if(head.right != null){
                queue.add(head.right);
            }
            
            if(queue.peek() == null) {
                result.add(levelElements);
                levelElements = new ArrayList<>();
                if(queue.size() == 1)
                    break;
                else
                    queue.add(queue.remove());
            }
        }
        return result;
        
    }
}