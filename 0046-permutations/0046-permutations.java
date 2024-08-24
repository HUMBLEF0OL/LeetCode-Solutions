class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void helper(int nums[],List<Integer> current){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i =0;i<nums.length;i++){
            if(!current.contains(nums[i])){
                current.add(nums[i]);
                helper(nums,current);
                current.remove(Integer.valueOf(nums[i]));
            }   
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        helper(nums,current);
        
        return result;
    }
}