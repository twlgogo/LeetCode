
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/22
 * Time: 下午8:00
 */
public class HouseRobber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []res = new int[N];
        for (int i = 0; i <N ; i++) {
            int n = sc.nextInt();
            int []knowledges = new int[n];
            for (int j = 0; j <n ; j++) {
                knowledges[j] = sc.nextInt();
            }
            int []k1 = Arrays.copyOf(knowledges,n-1);
            int []k2 = Arrays.copyOfRange(knowledges,1,n);
            int A = rob(k1);
            int B = rob(k2);
            res[i] = Math.max(A,B);
        }
        for (int i = 0; i <N; i++) {
            System.out.println(res[i]);
        }
    }
    public static int rob(int[] nums) {
        int preNotRob = 0 ;
        int preRob = 0;
        for (int n:nums) {
            int temp = preNotRob;
            preNotRob = Math.max(preNotRob,preRob);
            preRob = n + temp;
        }
        return Math.max(preNotRob,preRob);
    }
}
