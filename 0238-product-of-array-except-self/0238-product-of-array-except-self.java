class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        // left product
        result[0] = 1;
        for(int i =1;i<result.length;i++){
            result[i] = result[i-1]*nums[i-1];
        }
        //right product
        int rightProduct = 1;
        for(int i=result.length-1;i>=0;i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}