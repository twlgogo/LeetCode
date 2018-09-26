import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/22
 * Time: 下午8:19
 */
public class CoinExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []resArray = new int[N];
        for (int i = 0; i <N ; i++) {
            int k = sc.nextInt();
            int tar = sc.nextInt();
            int []coins = new int[k];
            for (int j = 0; j <k ; j++) {
                coins[j] = sc.nextInt();
            }
            Arrays.sort(coins);
            int res = coinExchange(tar,k,coins)%100000007;
            resArray[i] = res;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(resArray[i]);
        }

    }

    private static int coinExchange(int n, int k, int []coins ){
        if (n == 0){
            return 1;
        }
        if (n < 0||k == 0){
            return 0;
        }
        return coinExchange(n,k-1, coins)+ coinExchange(n-coins[k-1],k,coins);
    }
}
