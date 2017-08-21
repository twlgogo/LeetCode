import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 14:01
 */
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null||nums.length==0)return 0;
        int index=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[index])
                nums[++index] = nums[i];
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
