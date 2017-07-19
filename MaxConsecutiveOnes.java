/**
 * Created by ttwl on 2017/7/16.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == 1 ){
                index++;
            }
            if (nums[i]==0 || i==nums.length-1){
                if (index >= result){
                    result = index;

                }
                index = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {1,0,1,0,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(test));
    }
}
