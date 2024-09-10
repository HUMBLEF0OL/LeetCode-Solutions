class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buyAmount = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i] < buyAmount){
                buyAmount = prices[i];
            }else{
                result = Math.max(prices[i]-buyAmount,result);
            }
            
        }
        return result;
    }
}