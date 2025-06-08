public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    static int maxProfit(int[] prices){
        int min = prices[0];
        int maxProfit = 0;

         for(int i=0; i < prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min);
         }
         return maxProfit;
    }
}
