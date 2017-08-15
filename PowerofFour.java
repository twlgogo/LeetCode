/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/15
 * Time: 17:47
 * 神奇的0x55555555
 * 可以判断一个数能否被2整除。
 */
public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        return num>0 && (num&(num-1))==0 && (num&0x55555555)!=0;
    }
}
