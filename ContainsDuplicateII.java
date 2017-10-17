import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length==0)return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <Math.min(k,nums.length); i++) {
            if (!set.add(nums[i]))return true;
        }
        int index = 0;
        for (int i = k; i <nums.length; i++) {
            if (!set.add(nums[i]))return true;
            set.remove(nums[index++]);
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] nums = {1,1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }
}
