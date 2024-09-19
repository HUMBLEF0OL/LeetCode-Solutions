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
    /*
    ************* DFS *************
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
    */
    public Node cloneGraph(Node node) {
        if(node == null)return null;
        
        Map<Node,Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.put(node,new Node(node.val,new ArrayList<>()));
        
         // BFS traversal
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Iterate through the neighbors of the current node
            for (Node neighbor : current.neighbors) {
                // If the neighbor hasn't been cloned yet, clone and add to visited
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);  // Add the neighbor to the queue for BFS
                }

                // Add the cloned neighbor to the current node's clone's neighbor list
                visited.get(current).neighbors.add(visited.get(neighbor));
            }
        }
        return visited.get(node);
    }
}