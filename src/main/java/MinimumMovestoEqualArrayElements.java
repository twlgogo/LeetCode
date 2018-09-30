
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/3
 * Time: 10:33
 * 数学问题：每次都让剩下的n-1个数加1，且最小的数一定需要进行m次操作达到最终值
 * 假设x是最终达到的数字，n是数组长度，sum是整个数组的初始和，minNum是初始的最小数字，m是操作数，则有一下等式：
 * sum+m*（n-1）= x * n ；     x = minNum + m
 *
 */
public class MinimumMovestoEqualArrayElements {
    public static int minMoves(int[] nums) {
        int sum = 0, minNum = nums[0];
        for (int i = 0; i <nums.length; i++) {
            sum += nums[i];
            if (nums[i]<minNum) minNum =nums[i];
        }
        return sum-minNum*nums.length;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
}
