
/**
 * Created by ttwl on 2017/6/29.
 */
public class ReverseInt {
    public static int reverse(int x) {
        int reverseNum = 0;
        int flag= 1;
        if(x<=0){
            flag = -1;
            x = -x;
        }
        while(x != 0){
            int lastNum = x%10;
            int tempResult = reverseNum *10 + lastNum;
            if ((tempResult - lastNum)/10 != reverseNum){  // 如果发生越界，则无法还原会原来的结果
                return 0;
            }
            reverseNum = tempResult;
            x = x/10;
        }
        if (flag >0)return reverseNum;
        else return -reverseNum;

    }
    public static void main(String[] argus){
        System.out.println(ReverseInt.reverse(2147483647));
        System.out.println(ReverseInt.reverse(1534236469));
    }
}
