
/**
 * Created by ttwl on 2017/7/10.
 */
public class ReverseString {
    public static String reverseString(String s) {
        char[] chars = new char[s.length()];
        char []resultChars = new char[s.length()];
        chars = s.toCharArray();
        for (int i = s.length()-1,j=0; i >=0 ; i--,j++) {
            resultChars[j] = chars[i];
        }
        String result = new String(resultChars);
        return result;
    }

    public static void main(String[] args) {
        String s = "hello";
        String result = reverseString(s);
        System.out.println(result);
    }
}
