
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/19
 * Time: 下午7:27
 */
public class dirSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            i  = i + findMax(s.substring(i)) ;
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());

    }
    private static int findMax(String s){
        int max = 0;
        char temp = s.charAt(0);
        for (int i = 0; i <s.length() ; i++) {
            if (temp < s.charAt(i)){
                max = i ;
                temp = s.charAt(i);
            }
        }
        return max;
    }
}
