/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 10:33
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int result = 0, oddNum = 0;
        boolean flag = false;
        int[] dicLetters = new int[52];
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                dicLetters[s.charAt(i)-'a']++;
            }else dicLetters[s.charAt(i)-'A'+26]++;
        }
        for (int i = 0; i <52 ; i++) {
            if (dicLetters[i]%2 == 1){
                flag = true;
                oddNum =  Math.max(dicLetters[i],oddNum);
                result += dicLetters[i] -1;
            }else result += dicLetters[i];
        }
        if (flag)return result+1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
}
