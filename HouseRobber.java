import java.rmi.MarshalException;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 14:28
 */
public class HouseRobber {
    public static int robwrong(int[] nums) {
        if (nums == null || nums.length ==0)return 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i <nums.length ; i+=2) {
            sum1 += nums[i];
        }
        for (int i = 1; i <nums.length ; i+=2) {
            sum2 += nums[i];
        }
        return sum1>sum2?sum1:sum2;
    }

    public static int rob(int[] nums) {
        int preNotRob = 0 ;
        int preRob = 0;
        for (int n:nums) {
            int temp = preNotRob;
            preNotRob = Math.max(preNotRob,preRob);
            preRob = n + temp;
        }
        return Math.max(preNotRob,preRob);
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(rob(nums));
    }
}
