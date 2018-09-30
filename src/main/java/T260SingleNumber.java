
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 3:39 PM
 */
public class T260SingleNumber {
  public int[] singleNumber(int[] nums) {
    int [] res = new int[2];
    int xorRes = 0;
    for (int i = 0; i < nums.length; i++) {
      xorRes ^= nums[i];
    }
    int first1Bit = findFirstOneBit(xorRes);
    for (int i = 0; i < nums.length; i++) {
      if (isBit1(nums[i], first1Bit)) {
        res[0] ^= nums[i];
      } else {
        res[1] ^= nums[i];
      }
    }
    return res;
  }

  private int findFirstOneBit(int num) {
    int first1Bit = 0;
    while (((num & 1) == 0 ) && first1Bit < 32) {
      first1Bit++;
      num >>= 1;
    }
    return first1Bit;
  }
  private boolean isBit1(int num, int bit){
    num >>= bit;
    return (num&1) == 1;
  }

  public static void main(String[] args) {
    T260SingleNumber singleNumber = new T260SingleNumber();
    int []nums2 = {-1,-1,2,2,1,3};
    int [] nums = {1638685546,2084083624,307525016,930251592,1638685546,1354460680,623522045,1370026032,307525016,2084083624,930251592,472570145,1370026032,1063150409,160988123,1122167217,1145305475,472570145,623522045,1122167217,1354460680,1145305475};
    System.out.println(Arrays.toString(singleNumber.singleNumber(nums)));
  }
}
