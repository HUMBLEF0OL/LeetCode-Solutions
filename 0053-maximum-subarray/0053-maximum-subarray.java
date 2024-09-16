class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:nums){
            sum += i;
            if(sum<i)sum = i;
            result = Math.max(result,sum);
        }
        return result;
    }
}