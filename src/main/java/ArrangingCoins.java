
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 13:09
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n<=0)return 0;
        long sum = 0;
        int i = 1;
        for (; ; i++) {
            sum += i;
            if (sum > n)
                break;
        }
        return i-1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(2147483647));
    }
}
