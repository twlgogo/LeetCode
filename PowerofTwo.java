/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 11:45
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n)==1;
    }
}
