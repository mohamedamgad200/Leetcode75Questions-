class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitValue=0;
        int minPrice=Integer.MAX_VALUE;
        for(int price:prices)
        {
         minPrice=Math.min(minPrice,price);
         maxProfitValue=Math.max(maxProfitValue,price-minPrice);
        }
         return maxProfitValue;
    }
}