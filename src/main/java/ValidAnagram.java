
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 10:04
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] dicS = new int[26];
        int[] dicT = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            dicS[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i <t.length() ; i++) {
            dicT[t.charAt(i) - 'a']++;
        }
        int i = 0;
        for (; i <26 ; i++) {
            if (dicS[i] != dicT[i])break;
        }
        return i==26;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagarm"));
    }
}
