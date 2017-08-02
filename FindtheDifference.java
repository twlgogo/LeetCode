/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/1
 * Time: 14:15
 * 使用string型的charAt方法返回index处的char值
 * 类似于找出只出现一次的数字那道题
 * 使用按位异或的方式找到只出现一次的字符
 */
public class FindtheDifference {
    public static char findTheDifference(String s, String t) {
        char result = t.charAt(t.length()-1);
        for (int i = 0; i <s.length() ; i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("adc","abcd"));
    }
}
