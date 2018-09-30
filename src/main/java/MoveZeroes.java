
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/2
 * Time: 11:46
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int temp = 0,index = 0;
//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i] == 0){
//                for (int j = i; j <nums.length -1; j++) {
//                    temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums [j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                while (nums[i] == 0 ) {
//                    index++;
//                    for (int j = i; j < nums.length - 1; j++) {
//                        nums[j] = nums[j + 1];
//                    }
//                }
//            }
//        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] !=0){
                nums[index ++] = nums[i];
            }
        }
        for (int i = index, j = nums.length - 1; i < nums.length; i++) {
            nums[j--] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,4};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
