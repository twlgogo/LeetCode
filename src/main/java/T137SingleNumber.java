
/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 10:25 AM
 */
public class T137SingleNumber {
  public static int singleNumber(int[] nums) {
    int[] bitsCount = new int[32];
    int bitMask = 1;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < 32; j++) {
        bitsCount[j] += ((nums[i] >> j) & bitMask) ;
      }
    }
    int res = 0;
    for (int i = 0; i < bitsCount.length ; i++) {
      res += (bitsCount[i] % 3) << i;
    }
    return res;
  }

  public static void main(String[] args) {
    int []nums = {2,2,3,2};
    int []nums2 = {0,1,0,1,0,1,99};
    System.out.println(singleNumber(nums) + " " + singleNumber(nums2));
  }
}
