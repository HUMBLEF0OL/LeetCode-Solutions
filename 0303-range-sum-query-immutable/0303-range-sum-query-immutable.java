class NumArray {
    List<Integer> list = new ArrayList<>();
    
    public NumArray(int[] nums) {
        for(int i =0;i<nums.length;i++){
            list.add(nums[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        if(left>right)return 0;
        int result = 0;
        int i =left;
        while(i<=right){
            result += list.get(i++);
        }
        return result;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */