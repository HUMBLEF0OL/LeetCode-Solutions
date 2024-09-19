/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null)return null;
        if(map.containsKey(node))return map.get(node);
        
        Node cloneNode = new Node(node.val,new ArrayList<>());
        
        map.put(node,cloneNode);
        for(Node currentNode:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(currentNode));
        }
        return cloneNode;
       
    }
}