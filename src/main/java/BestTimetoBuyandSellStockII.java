
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/5
 * Time: 22:02
 */
public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i <prices.length-1 ; i++) {
            if (prices[i+1]>prices[i])
                result += prices[i+1]-prices[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,4,5};
        System.out.println(maxProfit(a));
    }
}
