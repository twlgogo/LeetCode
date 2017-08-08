/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 11:00
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = (nums.length)*(nums.length+1)/2;
        for (int i: nums) {
            sum -= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3};
        System.out.println(missingNumber(nums));
    }
}
