
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/19
 * Time: 下午8:19
 */
public class threeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int ans;
        if ((array[1]-array[0])%2==0){
            ans = (array[1] - array[0])/2 + (array[2]-array[1]);
        }else {
            ans = (array[1]+1 - array[0])/2 + (array[2] - array[1]) + 1;
        }

        System.out.println(ans);
    }
}
