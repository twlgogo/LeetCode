
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 15:11
 * 不要受到思维定式的影响，注意的是，在计算机中，本身就是以二进制的补码来进行储存int型的数据的
 * 则只要每次将它的后四位取出，找到其对应的映射就好
 */
public class ConvertaNumbertoHexadecimal {
    public static String toHex(int num) {
        if (num == 0)return "0";
        char[] map ={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result = "";
        while(num != 0){
            result = map[(num&15)]+result;
            num = num >>>4;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toHex(-2));
    }
}
