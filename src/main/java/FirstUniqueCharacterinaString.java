
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 12:21
 */
public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        int result = -1;
        for (int i = 0; i <s.length() ; i++) {
            int j = 0;
            for (; j <s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j) && i!=j)break;
            }
            if (j == s.length()){
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
