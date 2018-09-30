
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 下午5:07
 */
public class T890FindAndReplacePattern {
  public static List<String> findAndReplacePattern(String[] words, String pattern) {
    List<String> resList = new ArrayList<>();
    Map<Character,Character> map = new HashMap<>();
    Map<Character,Character> map2 = new HashMap<>();
    for (String word:words) {
      if (word.length() != pattern.length()){
        continue;
      }
      for (int i = 0; i < word.length(); i++) {
        if (!map.containsKey(word.charAt(i)) && !map2.containsKey(pattern.charAt(i))) {
          map.put(word.charAt(i),pattern.charAt(i));
          map2.put(pattern.charAt(i),word.charAt(i));
        }
      }
      char[] wordArray = word.toCharArray();
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < word.length(); i++) {
        stringBuilder.append(map.get(wordArray[i]));
      }
      if (pattern.equals(stringBuilder.toString())) {
        resList.add(word);
      }
      map.clear();
      map2.clear();
    }
    return resList;
  }

  public static void main(String[] args) {
    String[] strings = {"mee","aqq","dkd","ccc"};
    String s = "abb";
    List<String> res = findAndReplacePattern(strings,s);
  }
}
