/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/11
 * Time: 10:45
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0)return 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] >= target)return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,5));
        System.out.println(searchInsert(nums,2));
        System.out.println(searchInsert(nums,7));
        System.out.println(searchInsert(nums,0));
    }
}
