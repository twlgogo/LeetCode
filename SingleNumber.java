/**
 * Created by ttwl on 2017/7/14.
 * 异或的特性以及异或的交换律
 * 异或：相同为0，不同为1
 * Java中直接利用交换律进行按位异或
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,2,3}));
    }
}
