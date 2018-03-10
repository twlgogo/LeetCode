/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang with lwy
 * Date: 2017/11/11
 * Time: 上午10:53
 */
public class CanPlaceFlowers {
    public static  boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || flowerbed.length==0)return false;
        //if (n > flowerbed.length/2)return false;
        int count = 0;
        for (int i = 0; i < flowerbed.length && count<n; i++) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count== n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,1));
    }
}
