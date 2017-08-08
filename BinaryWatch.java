import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 9:57
 */
public class BinaryWatch {
    public static List<String> readBinaryWatch(int num) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <12 ; i++) {
            for (int j = 0; j <60 ; j++) {
                if (Integer.bitCount(i)+Integer.bitCount(j) == num)
                    result.add(String.format("%d:%02d",i,j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
