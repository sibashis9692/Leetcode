class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;

        for(int i = 1; i <= prices.length - 1; i++){
            if(min > prices[i]){
                min = prices[i];
            }

            int profit = prices[i] - min;

            if(profit > max_profit){
                max_profit = profit;
            }
        }

        return max_profit;
    }
}