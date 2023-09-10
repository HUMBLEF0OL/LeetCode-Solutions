class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int overallProduct = 1;
        for(int i:nums){
            if(i == 0)zeroCount++;
            else overallProduct *= i;
        }
        int result[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(zeroCount > 1 || (zeroCount == 1 && nums[i] != 0)) result[i] = 0;
            else if(nums[i] == 0) result[i] = overallProduct;
            else result[i] = overallProduct/nums[i];
        }
        return result;
    }
}