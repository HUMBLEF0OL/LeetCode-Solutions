class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public int helper(int r,int c,int row,int col,int[][] dp){
        if(r >=row || c>=col)return 0;
        if(r == row-1 && c == col-1)return 1;
        if(dp[r][c] != -1)return dp[r][c];
        
        dp[r][c] = helper(r+1,c,row,col,dp)+helper(r,c+1,row,col,dp);
        return dp[r][c];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return helper(0,0,m,n,dp);
    }
}