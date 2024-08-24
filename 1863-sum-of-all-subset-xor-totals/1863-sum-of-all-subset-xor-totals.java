class Solution {
    public int helper(int nums[],int index,int sum){
        if(index == nums.length)return sum;
        
        int withCurrent = helper(nums,index+1,sum^nums[index]);
        int withoutCurrent = helper(nums,index+1,sum);
        return withCurrent+withoutCurrent;
        
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
}