import java.util.Arrays;

/**
 * Created by ttwl on 2017/7/11.
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        int index,indexj=0,i;
        for (int element :findNums){
            for (index = 0; index < nums.length ; index++) {
                if (element == nums[index]) break;
            }
            for ( i = index ; i <nums.length ; i++) {
                if (nums[i] >element){result[indexj++] = nums[i];break;}
            }
            if (i == nums.length)result[indexj++] = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4},nums2 = {1,2,3,4};
        int[] result = new int[nums1.length];
        result = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
