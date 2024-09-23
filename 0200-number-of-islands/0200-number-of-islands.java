class Solution {
    public void helper(char[][] grid,int i,int j){
        // check bound
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        helper(grid,i-1,j);
        helper(grid,i+1,j);
        helper(grid,i,j-1);
        helper(grid,i,j+1);
        
               
            
        
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                // if island found
                if(grid[i][j] == '1'){
                    count++;
                    // sink the island
                    helper(grid,i,j);
                }
            }
        }
        return count;
    }
}