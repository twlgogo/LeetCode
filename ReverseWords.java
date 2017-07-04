import java.lang.reflect.Array;

/**
 * Created by ttwl on 2017/7/4.
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        String []tempWords = s.split(" ");
        String result = "";
        for (int i = 0; i <tempWords.length ; i++) {
           char []tempChar = tempWords[i].toCharArray();
           char []tempReverse = new char[tempChar.length];
            for (int j = tempChar.length-1,k=0; j >=0 ; j--,k++) {
                tempReverse[k] = tempChar[j];
            }
            result += new String(tempReverse);
            result += " ";
        }
        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args) {
        String s = "sdaj dasd sda";

        System.out.println(reverseWords(s));
    }
}
