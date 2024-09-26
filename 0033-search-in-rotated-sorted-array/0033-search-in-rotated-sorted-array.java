class Solution {
    public int search(int[] nums, int target) {
        int left = 0,right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target)return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // Search in the left half
                } else {
                    left = mid + 1;   // Search in the right half
                }
            }
             else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // Search in the right half
                } else {
                    right = mid - 1;  // Search in the left half
                }
            }
        }
        return -1;
    }
}