import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 15:15
 */
public class MaximumProductofThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                nums[0]*nums[1]*nums[nums.length-1]);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,2,3};
        System.out.println(maximumProduct(nums));
    }
}
