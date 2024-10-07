class Solution {
    public void helper(int []nums,int index,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            helper(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums,0,current,result);
        return result;
    }
}