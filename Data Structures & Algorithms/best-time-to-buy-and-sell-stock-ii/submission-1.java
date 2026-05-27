class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i=0; i < prices.length-1 ; i++){
            int currentprofit = 0;
            if(prices[i+1] > prices[i]){
                currentprofit = prices[i+1] - prices[i];
            }
            profit += currentprofit;
        }
        return profit;
        
    }
}