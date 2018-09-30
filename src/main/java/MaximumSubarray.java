
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/11
 * Time: 11:40
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE ,sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (sum<0)sum = nums[i];
            else sum += nums[i];
            if (max<sum)max = sum;
        }
        return max;
    }
}
