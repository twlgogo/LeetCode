
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/7/31
 * Time: 16:27
 */
public class FindAllNumbersDisappearedinanArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            int flag = Math.abs(nums[i]) -1;
            if (nums[flag] > 0){
                nums[flag] = - nums[flag];
            }
        }

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
        int []a = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(a);
        System.out.println(result);
    }
}
