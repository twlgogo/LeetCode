
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/29
 * Time: 10:55
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || s.length()<=0)return true;
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        for (int i = 0; i <s.length() ; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)){
                if (map.get(a)==b)continue;
                else return false;
            }else {
                if (!map.containsValue(b)){
                    map.put(a,b);
                }else return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab","aa"));
    }
}
