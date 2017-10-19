/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/10/19
 * Time: 上午11:02
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        //if(s == null || s.length() == 0)return false;
        int l = -1 , r = s.length();
        while (++l < --r){
            if (s.charAt(l)!=s.charAt(r))return isPalindric(s,l,r+1)||
                    isPalindric(s,l-1,r);
        }
        return true;

    }
    private boolean isPalindric(String s,int l ,int r){
        while(++l < --r){
            if (s.charAt(l)!=s.charAt(r))return false;
        }
        return true;
    }
}
