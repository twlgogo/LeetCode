/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/16
 * Time: 14:09
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = s.length() / 2; i >= 1; i--) {
            if (s.length() % i == 0) {
                String str = s.substring(0, i);
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < s.length() / i; j++) {
                    temp.append(str);
                }
                if (temp.toString().equals(s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
}
