import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 12:15
 */
public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int sum = nums[nums.length-1];
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                result[0] = nums[i];
            }
            sum += nums[i];
        }
        int realSum = (nums.length+1)*nums.length/2;
        result[1] = realSum - sum + result[0];
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

}
