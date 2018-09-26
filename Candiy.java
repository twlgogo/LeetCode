import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/19
 * Time: 下午8:37
 */
public class Candiy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []l = new int[n];
        int []r = new int[n];
        for (int i = 0; i < n ; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        long ans = candy(n,m,l,r);
        System.out.println(ans);
    }
    private static long candy(int n, int m, int[] l, int[] r) {
        long ok = 0;
        int[] count = new int[n];
        System.arraycopy(l, 0, count, 0, n);
        for (;;) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += count[i];
                if (sum > m) break;
            }
            if (sum == m) {
                ok += 1;
            }
            boolean pass = false;
            for (int i = 0; i < n; i++) {
                count[i] += 1;
                if (count[i] > r[i]) {
                    count[i] = l[i];
                } else {
                    pass = true;
                    break;
                }
            }
            if (!pass) {
                break;
            }
        }

        return ok;
    }
}
