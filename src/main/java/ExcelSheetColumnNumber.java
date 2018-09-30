
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/5
 * Time: 21:09
 * 实质是进制的问题，注意进制问题的变型
 */
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length()-1; i>=0 ; i--) {
            result += (int)((s.charAt(i) - 'A' + 1)*Math.pow(26,s.length()-i-1));

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AAA";
        System.out.println(s.charAt(0));
        System.out.println(titleToNumber(s));
    }
}
