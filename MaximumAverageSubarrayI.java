/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 15:11
 */
public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        //if(nums.length == 1)return nums[0];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length-k+1 ; i++) {
            for (int j = 0; j <k ; j++) {
               sum +=  nums[i+j];
            }
            maxSum = Math.max(sum,maxSum);
            sum = 0;
        }
        double result = (double) maxSum/k;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxAverage(nums,1));
    }
}
