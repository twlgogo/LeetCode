/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/10/19
 * Time: 上午10:15
 */
public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)return 0;
        s = s.trim();
        int result = 0;
        for (int i = s.length()-1; i > -1 ; i--) {
            if (Character.isLetter(s.charAt(i)))
                result++;
            else break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
