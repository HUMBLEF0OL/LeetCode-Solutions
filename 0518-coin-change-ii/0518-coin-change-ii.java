class Solution {
    // brute-force recursive solution
    public int numberOfWays(int amount,int coins[],int i){
        if(amount == 0){
            return 1;
        } else if(i >= coins.length || amount < 0)return 0;
        
        int result = 0;
        // either take the current coin
        result += numberOfWays(amount-coins[i], coins,i++);
        
        // or skip it
        result += numberOfWays(amount,coins,i++);
        return result;
        
    }
    
    public int findNumberOfWays(int amount,int coins[],int index,Map<String,Integer> memo){
        if(amount == 0) return 1;
        if(index >= coins.length || amount <0)return 0;
        
        String memoKey = index + "-" + amount;
        // if we already have the solution of current amount then return it
        if(memo.containsKey(memoKey)){
            return memo.get(memoKey);
        }
        int includeCurrentCoin = findNumberOfWays(amount-coins[index],coins,index,memo);
        int excludeCurrentCoin = findNumberOfWays(amount, coins,index+1,memo);
        int totalCombination = includeCurrentCoin + excludeCurrentCoin;
        
        // put the current value in the memo
        memo.put(memoKey,totalCombination);
        return totalCombination;
    }
    
    public int change(int amount, int[] coins) {
        // return numberOfWays(amount,coins,0);
        Map<String,Integer> memo = new HashMap<>();
        return findNumberOfWays(amount,coins,0,memo);
    }
}