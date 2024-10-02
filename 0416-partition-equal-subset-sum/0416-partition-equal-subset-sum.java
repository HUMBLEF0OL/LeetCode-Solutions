class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i:nums){
            totalSum+=i;
        }
        if(totalSum%2 !=0)return false;
        int target = totalSum/2;
        Set<Integer> possibleSums = new HashSet<>();
        for(int i:nums){
            if(i == target)return true;
            
            Set<Integer> currentPossibleSum = new HashSet<>();
            for(int j:possibleSums){
                if(i+j == target)return true;
                if(i+j < target) currentPossibleSum.add(i+j);
            }
            currentPossibleSum.add(i);
            possibleSums.addAll(currentPossibleSum);
        }
        return false;
    }
}