
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 14:18
 */
public class BestTimetoBuyandSellStock {
    public static int maxProfitwarong(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                if (result < prices[j]-prices[i])result = prices[j]-prices[i];
            }
        }
        return result;
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length==0)return 0;
        int profit = 0;
        int minPrices = prices[0];
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]<minPrices)minPrices = prices[i];
            else{
                if (prices[i] - minPrices>profit)profit = prices[i] - minPrices;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
