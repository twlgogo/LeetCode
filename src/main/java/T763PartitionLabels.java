
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/26
 * Time: 11:30 PM
 */
public class T763PartitionLabels {
  public static List<Integer> partitionLabels(String S) {
    List<Integer> resList = new ArrayList<>();
    if (S == null || S.length() == 0) return resList;
    char[] chars = S.toCharArray();
    Map<Character,Integer> lastMap = new HashMap<>();
    for (int i = 0; i <chars.length ; i++) {
      lastMap.put(chars[i],i);
    }
    int last = lastMap.get(chars[0]);
    int begin = 0;
    while (true) {
      for (int i = begin; i < last; i++) {
        if (lastMap.get(chars[i]) > last) {
          last = lastMap.get(chars[i]);
        }
      }
      resList.add(last - begin + 1);
      if (last == chars.length - 1) break;
      begin = last + 1;
      last = lastMap.get(chars[begin]);
    }
    return resList;
  }

  public static void main(String[] args) {
    String s = "ababcbacadefegdehijhklij";
    System.out.println(partitionLabels(s));
  }
}
