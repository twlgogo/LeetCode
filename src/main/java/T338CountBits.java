
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 上午10:39
 */
public class T338CountBits {
  public static int[] countBits(int num) {
    if (num < 0) return  null;
    int []countRes = new int[num + 1];
    if (num == 0)return countRes;
    for (int i = 1; i < countRes.length ; i++) {
      countRes[i] = countRes[i - getHelper(i)] + 1;
    }
    return countRes;
  }

  private static int getHelper(int n) {
    int base = 2;
    while (base <= n) {
      base *= 2;
    }
    return base/2;
  }

  public static void main(String[] args) {
    int[] countRes = countBits(10);
    System.out.println(Arrays.toString(countRes));
  }
}
