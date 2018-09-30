
import java.util.HashSet;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 11:03
 */
public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum,tail;
        while(set.add(n)){
            sum = 0;
            while(n > 0){
                tail = n%10;
                sum = sum + tail*tail;
                n = n/10;
            }
            if (sum == 1)return true;
            else n = sum;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }
}
