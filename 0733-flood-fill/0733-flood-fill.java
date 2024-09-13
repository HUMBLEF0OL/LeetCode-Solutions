class Solution {
    public void helper(int [][]image,int sr,int sc,int color,int old){
        if(sr >= 0 && sr<image.length && sc >=0 && sc<image[0].length){
            if(image[sr][sc] == color)return;
            if(image[sr][sc] != old)return;
            image[sr][sc] = color;
            
            helper(image,sr-1,sc,color,old);
            helper(image,sr,sc-1,color,old);
            helper(image,sr+1,sc,color,old);
            helper(image,sr,sc+1,color,old);
        }
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}