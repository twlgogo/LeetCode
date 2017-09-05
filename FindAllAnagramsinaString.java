import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/30
 * Time: 10:18
 */
public class FindAllAnagramsinaString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        if (s==null||s.length()==0||p==null||p.length()==0)return result;
        int[] hash = new int[256];
        for (char c: p.toCharArray()) {
            hash[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while(right<s.length()){
            if (hash[s.charAt(right++)]-->=1)count--;
            //在s中找到p中有的字符，差异度降低
            if(count==0)result.add(left);
            if (right-left==p.length()&&hash[s.charAt(left++)]++>=0)count++;
            //恢复差异度，只有在p中找到原来有的字符的时候才恢复差异度
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("aaa","a"));
    }
}
