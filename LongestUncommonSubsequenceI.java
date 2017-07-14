/**
 * Created by ttwl on 2017/7/14.
 */
public class LongestUncommonSubsequenceI {
    public static int findLUSlength(String a, String b) {
        if (a.equals(b))return -1;
        else return Math.max(a.length(),b.length());
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "cbc";
        System.out.println(findLUSlength("",""));
        //System.out.println(a.substring(1,1));
    }
}
