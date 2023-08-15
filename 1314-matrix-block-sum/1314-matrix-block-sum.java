class Solution {
    public int findSum(int rl,int rh,int cl,int ch,int mat[][])
    {
        int sum = 0;
        for(int i =rl;i<=rh;i++)
        {
            for(int j = cl;j<= ch;j++)
                sum+=mat[i][j];
        }
        return sum;
    }
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int output[][] = new int[mat.length][mat[0].length];
        for(int i =0;i<mat.length;i++)
        {
            for(int j =0;j<mat[0].length;j++)
            {
                int rL = Math.max(0,i-k);
                int rH = Math.min(mat.length-1,i+k);
                
                int cL = Math.max(0,j-k);
                int cH = Math.min(mat[0].length-1,j+k);
                output[i][j] = findSum(rL,rH,cL,cH,mat);
            }
        }
        return output;
    }
}