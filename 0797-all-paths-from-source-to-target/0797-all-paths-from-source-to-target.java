class Solution {
    List<List<Integer>> paths = new ArrayList<>();
    public void helper(int[][] graph,int start,int end,List<Integer> current){
        current.add(start);
        if(start == end){
            paths.add(new ArrayList<>(current));
            return;
        }
        
        for(int nextNode:graph[start]){
           // current.add(nextNode);
           helper(graph,nextNode,end,current);
           current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        helper(graph,0,graph.length-1,path);
        return paths;
    }
}