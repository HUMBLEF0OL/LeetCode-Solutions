class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>maxFrequency) maxFrequency = map.get(i);
        }
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i) == maxFrequency)count++;
        }
        return count*maxFrequency;
    }
}