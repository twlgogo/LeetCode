import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 12:56
 */
public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        if (s == null||s.length()==0)return null;
        int cutPoint = k;
        List<String> strings = new LinkedList<>();
        String res = "";
        while(cutPoint<s.length()){
            strings.add(s.substring(cutPoint-k,cutPoint));
            cutPoint += k;
        }
        strings.add(s.substring(cutPoint-k,s.length()));
        for (int i = 0; i <strings.size() ; i++) {
            if (i%2==0){
                String elem =strings.get(i);
                elem=reverseString(elem);
                strings.set(i,elem);
            }
        }
        for (String subS:strings) {
            res+=subS;
        }
        System.out.println(res);
       return res;
    }
    private static String reverseString(String s) {
        char[] chars = new char[s.length()];
        char []resultChars = new char[s.length()];
        chars = s.toCharArray();
        for (int i = s.length()-1,j=0; i >=0 ; i--,j++) {
            resultChars[j] = chars[i];
        }
        return new String(resultChars);

    }

    public static void main(String[] args) {
        ReverseStringII.reverseStr("abcdefg",2);
    }
}
