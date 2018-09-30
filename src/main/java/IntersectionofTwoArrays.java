
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/3
 * Time: 11:06
 */
public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null||nums1.length==0)return nums1;
        if (nums2 == null||nums2.length==0)return nums2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> afterNums1 = new ArrayList<Integer>();
        ArrayList<Integer> afterNums2 = new ArrayList<Integer>();
        ArrayList<Integer> rawResult = new ArrayList<Integer>();
        int flagA = nums1[0];
        afterNums1.add(nums1[0]);
        for (int i = 0; i <nums1.length ; i++) {
            if (nums1[i] != flagA){
                afterNums1.add(nums1[i]);
                flagA = nums1[i];
            }
        }
        int flagB = nums2[0];
        afterNums2.add(nums2[0]);
        for (int i = 0; i <nums2.length ; i++) {
            if (nums2[i] != flagB){
                afterNums2.add(nums2[i]);
                flagB = nums2[i];
            }
        }
        for (int num1:afterNums1) {
            for (int num2:afterNums2) {
                if (num1 == num2)rawResult.add(num2);
            }
        }
        int []result = new int[rawResult.size()];
        for (int i = 0; i <result.length ; i++) {
            result[i] = rawResult.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums1 ={1,2,3,4},nums2 = {2,3};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
