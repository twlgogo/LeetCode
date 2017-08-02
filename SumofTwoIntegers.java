/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/1
 * Time: 10:33
 *  不能使用s四则运算，则只能考虑使用按位进行计算
 *  先将每位的进行异或，得到本位，再得到应该的进位，最后将进位加上
 */
public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum,carry);
    }

    public static void main(String[] args) {
        System.out.println(getSum(7,9));
    }
}
