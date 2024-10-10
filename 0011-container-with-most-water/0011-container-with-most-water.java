class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i =0,j=height.length-1;
        while(i<j){
            int current = 0;
            if(height[i]<height[j]){
                current = height[i]*(j-i);
                i++;
            }else {
                current = height[j]*(j-i);
                j--;
            }
            result = Math.max(result,current);
        }
        return result;
    }
}