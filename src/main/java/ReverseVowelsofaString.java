
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/15
 * Time: 17:28
 */
public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        if (s==null||s.length()==0)return s;
        char[] rowLetters = s.toCharArray();
        char[] vowels = new char[s.length()];
        int index = 0 ;
        for (int i = 0; i <rowLetters.length ; i++) {
            if (rowLetters[i]=='a'||rowLetters[i]=='e'||rowLetters[i]=='i'||rowLetters[i]=='o'||rowLetters[i]=='u'){
                vowels[index++] = rowLetters[i];
                rowLetters[i] = '$';
            }
            if (rowLetters[i]=='A'||rowLetters[i]=='E'||rowLetters[i]=='I'||rowLetters[i]=='O'||rowLetters[i]=='U'){
                vowels[index++] = rowLetters[i];
                rowLetters[i] = '$';
            }
        }
        for (int i = 0; i <rowLetters.length ; i++) {
            if (rowLetters[i]=='$')
                rowLetters[i] = vowels[--index];
        }
        return new String(rowLetters);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("HELLO"));
    }
}
