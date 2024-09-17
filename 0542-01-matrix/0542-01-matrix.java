class Solution {

    public int[][] updateMatrix(int[][] mat) {
        int result[][] = new int[mat.length][mat[0].length];
        Queue<int[]> queue = new LinkedList<>();
        
        
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(mat[i][j] == 0)queue.add(new int[]{i,j});
                else {
                    result[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int directions[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        
        // perform bfs
        while(!queue.isEmpty()){
            int currentIndex[] = queue.remove();
            int row = currentIndex[0];
            int column = currentIndex[1];
            
            for(int []dir:directions){
                int newRow = dir[0] + row;
                int newCol = dir[1] + column;
                
                if(newRow >= 0 && newRow <mat.length && newCol >=0 && newCol < mat[row].length){
                    if(result[newRow][newCol] > result[row][column]+1){
                        result[newRow][newCol] = result[row][column]+1;
                        queue.add(new int[]{newRow,newCol});
                    }
                }
            }
            
        }
        return result;
    }
}