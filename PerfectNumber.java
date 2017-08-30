import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/29
 * Time: 10:18
 * 判断一个数的因子的时候，一定只能判断到sqrt（num），否则只能超时
 */
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1)return false;
        int sum = 0;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i==0)
                sum += i+ num/i;
        }
        sum++;
        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
    }
}
