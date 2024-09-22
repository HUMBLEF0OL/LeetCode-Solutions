class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int product = 1;
        int zeroCounter = 0;
        for(int i:nums){
            if(i == 0)zeroCounter++;
            else product *=i;
        }
        if(zeroCounter >1)return result;
        for(int i=0;i<result.length;i++){
            if(nums[i] == 0)result[i] = product;
            else if(nums[i] != 0 && zeroCounter == 0){
                result[i] = product/nums[i];    
            }
            
        }
        return result;
    }
}