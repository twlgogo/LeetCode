/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/10/17
 * Time: 下午4:18
 */
public class SumofSquareNumbers {
/*
    public static boolean judgeSquareSum(int c) {
        if (c < 0)return false;
        for (int i = 0; i <=Math.sqrt(c) ; i++) {
            int tail = c - i*i;
            if (isSquare(tail))return true;
        }
        return false;
    }

    private static boolean isSquare(int num){    //判断一个数是否为平方数的方法
        if (num < 0)return false;
        if (num == 0)return true;
        for (int i = 1; num > 0 ; i += 2) {
            num -= i;
        }
        if (num == 0)return true;
        else return false;
    }
*/

    public static boolean judgeSquareSum(int c) {
        if (c<0)return false;
        int left = 0 ,right = (int)Math.sqrt(c);
        while (left<= right){
            int curres = left*left + right*right;
            if (curres<c)left++;
            else if (curres>c)right--;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(7));
    }
}
