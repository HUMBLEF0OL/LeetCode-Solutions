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
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);
        /* add delimiter */
        levels.add(null);
        List<Integer> nodes = new ArrayList<>();
        
        while(!levels.isEmpty()){
            TreeNode currentLevel = levels.remove();
            nodes.add(currentLevel.val);
            
            if(currentLevel.left != null) levels.add(currentLevel.left);
            if(currentLevel.right != null) levels.add(currentLevel.right);
            
            if(levels.peek() == null){
                list.add(new ArrayList<>(nodes));
                nodes = new ArrayList<>();
                levels.add(levels.remove());
                if(levels.size() == 1)break;
            }
            
        }
        return list;
    }
}