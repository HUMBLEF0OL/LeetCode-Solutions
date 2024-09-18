class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int j =i+1,k = nums.length-1;
            while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];

            if (sum == 0) {
                // Found a valid triplet
                list.add(Arrays.asList(nums[i], nums[j], nums[k]));

                // Skip duplicates for the second and third elements
                while (j < k && nums[j] == nums[j + 1]) j++;
                while (j < k && nums[k] == nums[k - 1]) k--;

                // Move both pointers after finding a valid triplet
                j++;
                k--;
            } else if (sum < 0) {
                j++; // We need a larger sum
            } else {
                k--; // We need a smaller sum
            }
        
        }
        }
        return list;
    }
}