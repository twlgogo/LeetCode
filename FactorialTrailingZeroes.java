/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 13:48
 */
public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        if (n<=0)return 0;
        int result = 0;
        long index =5;
        while(n >= index){
            result += n/index;
            index *= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(1808548329));
    }
}
