class Solution {
    
    public void helper(int[] candidates,int target,int start,List<List<Integer>> result,List<Integer> h){
        if(target == 0){
            result.add(new ArrayList<>(h));
            return;
        }
        if(target<0)return;
        
        for(int i= start;i<candidates.length;i++){
            h.add(candidates[i]);
            target-=candidates[i];
            helper(candidates,target,i,result,h);
            target+=candidates[i];
            h.remove(h.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> helperList = new ArrayList<>();
        helper(candidates,target,0,result,helperList);
        return result;
    }
}