
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/26
 * Time: 15:56
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0||(x!=0&&x%10==0))return false;
        int sum = 0;
        while(x>sum){
            sum = sum*10+x%10;
            x = x/10;
        }
        return (x==sum||sum/10==x);
    }
}
