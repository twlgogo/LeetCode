
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/2
 * Time: 12:49
 */
public class ConstructtheRectangle {
    public static int[] constructRectangle(int area) {
        if (area == 1)return new int[]{1,1};
        int []result = new int[2];
        for (int i = (int)Math.sqrt(area); i <area + 1; i++) {
            if (i * (int)(area/i) == area ){
                result[0] = Math.max(i,area/i);
                result[1] = Math.min(i,area/i);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            int[] result = constructRectangle(i);
            System.out.println(Arrays.toString(result));
        }
    }
}
