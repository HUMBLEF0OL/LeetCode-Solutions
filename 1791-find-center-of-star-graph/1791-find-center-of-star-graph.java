class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< edges.length;i++){
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);
        }
        int result[][] = new int[1][2];
        for(int keys : map.keySet()){
            if(map.get(keys) > result[0][1]){
                result[0][0] = keys;
                result[0][1] = map.get(keys);
            }
        }
        return result[0][0];
    }
}