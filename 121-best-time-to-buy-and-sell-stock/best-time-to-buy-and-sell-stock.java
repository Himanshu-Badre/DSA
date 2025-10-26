class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1; i<prices.length; i++){
            int currentPrice=prices[i];
            if(currentPrice<minPrice){
                minPrice=currentPrice;
            }else if(currentPrice-minPrice > maxProfit){
                maxProfit=currentPrice-minPrice;
            }
        }       
        return maxProfit; 
    }
}