class Solution {
    public int climbStairs(int n) {
        if(n <= 2)return n;
        int first = 1;
        int second = 2;
        int result = first + second;
        for(int i =1;i<=n-2;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}