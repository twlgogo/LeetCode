
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/1
 * Time: 10:56
 */
public class AddDigits {
    public static int addDigits(int num) {
        if (num == 0)return num;
        return ((num-1) % 9) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(addDigits(i));
        }
    }
}
