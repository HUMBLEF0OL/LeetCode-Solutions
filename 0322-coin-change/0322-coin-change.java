class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] result = new int[amount+1];
        result[0] = 0;
        for(int i=1;i<=amount;i++){
            result[i] = Integer.MAX_VALUE;
            for(int coin : coins){
                if(i-coin >= 0 && result[i-coin] != Integer.MAX_VALUE){
                    result[i] = Math.min(result[i],result[i-coin]+1);
                }
            }
        }
        return result[amount] == Integer.MAX_VALUE ? -1 : result[amount];
    }
}