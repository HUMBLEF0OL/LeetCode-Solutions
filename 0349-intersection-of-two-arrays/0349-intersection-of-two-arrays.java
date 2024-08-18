class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i :nums2){
            if(map.containsKey(i) && !list.contains(i))list.add(i);
        }
        int[] result = new int[list.size()];
        for(int i =0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}