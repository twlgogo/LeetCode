import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/4/2
 * Time: 下午4:53
 */
public class UniqueMorseCodeWords {
    private static int uniqueMorseRepresentations(String[] words) {
        if (words == null || words.length == 0)return 0;
        String [] charaMap = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words){
            String temp = "";
            for (char c : word.toCharArray()){
                temp += charaMap[c - 'a'];
            }
            set.add(temp);
        }
        return set.size();
    }
    public static void main(String[] args) {
        String [] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
