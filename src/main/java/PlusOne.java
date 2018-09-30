
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 15:55
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int k = 0;
        for (k = 0; k<digits.length ; k++) {
            if (digits[k] != 9)break;
        }
        if (k == digits.length){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        int []result = new int[digits.length];
        result[digits.length-1] = (1 + digits[digits.length-1])%10;
        carry = (digits[digits.length-1] + 1)/10;
        for (int i = digits.length-2; i >= 0 ; i--) {
            result[i] = (carry + digits[i])%10;
            carry = (carry+digits[i])/10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
