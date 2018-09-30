
import java.util.HashMap;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/9/5
 * Time: 16:55
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        if(pattern == null || pattern.length() == 0 || str == null ||str.length()==0)return false;
        if (pattern.toCharArray().length!=str.split(" ").length)return false;
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        String[] strings = str.split(" ");
        for (int i = 0; i <pattern.length() ; i++) {
            char c = charArray[i];
            String tempStr = strings[i];
            if (map.containsKey(c)){
               continue;
            }else map.put(c,tempStr);
        }
        for (int i = 0; i <pattern.length() ; i++) {
            char c = charArray[i];
            String tempStr = strings[i];
            if (map2.containsKey(tempStr)){
                continue;
            }else map2.put(tempStr,c);
        }
        for (int i = 0; i <pattern.length() ; i++) {
            //map.containsValue()
            char c = charArray[i];
            String tempStr = strings[i];
            if (c == map2.get(tempStr)&&tempStr.equals(map.get(c)))continue;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }
}
