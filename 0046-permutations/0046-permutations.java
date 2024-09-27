class Solution {
    public void helperFunction(int[] nums,List<List<Integer>> result,List<Integer> helper){
        if(helper.size() == nums.length){
            result.add(new ArrayList<>(helper));
            return;
        }
        for(int i : nums){
            if(!helper.contains(i)){
                helper.add(i);
                helperFunction(nums,result,helper);
                helper.remove(helper.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        helperFunction(nums,result,helper);
        return result;
    }
}