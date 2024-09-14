/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // apply binary search
        int low = 1;
        int high = n;
        int result=Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            boolean current = isBadVersion(mid);
            if(!current)low = mid+1;
            else{
                 high = mid-1;
                 result = mid;
            }
        }
        return result;
    }
}