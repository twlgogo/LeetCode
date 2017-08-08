import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 10:11
 */
public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums1List = new ArrayList<>();
        ArrayList<Integer> nums2List = new ArrayList<>();
        ArrayList<Integer> rawResult = new ArrayList<>();
        for (int num: nums1) {
            nums1List.add(num);
        }
        for (int num: nums2) {
            nums2List.add(num);
        }
        for (int num: nums1List) {
            for (int i = 0; i <nums2List.size() ; i++) {
                if (num == nums2List.get(i)){
                    rawResult.add(num);
                    nums2List.remove(i);
                    break;
                }
            }
        }
        int [] result = new int[rawResult.size()];
        for (int i = 0; i <rawResult.size() ; i++) {
            result[i] = rawResult.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1,3,4},
                nums2 = {1,2,2,1};
        int[] result = intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
