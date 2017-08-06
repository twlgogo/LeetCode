import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 11:05
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static int majorityElement2(int[] nums) {
        int currNum = nums[0];
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == currNum)index++;
            else index--;
            if (index == 0) {currNum = nums[i];index = 1;}
        }
        return currNum;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement2(nums));
    }
}
