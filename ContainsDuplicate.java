import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 10:16
 */
public class ContainsDuplicate {
    public static boolean containsDuplicateWrong(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] == nums[j])return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1])return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }
}
