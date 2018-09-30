
/**
 * Created by ttwl on 2017/7/2.
 */
public class NumberComplement {
    public static int findComplement(int num) {
        int  pow = 1, result=0;
        while (num != 0) {
            if ((num & 1) != 1)
                result +=  pow;
            num >>= 1;
            pow <<= 1;
        }
        return result;

    }
    public static int findComplement2(int num){
        long index = 1;
        while(index <=num){
            index *= 2;
        }
        long result = index - num;
        return (int)result;
    }

    public static  void main(String []argus){

        System.out.print(NumberComplement.findComplement(1));
    }

}
