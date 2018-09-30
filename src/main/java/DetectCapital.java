
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/7/19
 * Time: 14:55
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char []stringWord = word.toCharArray();
        int flag = -1;
        int j = 0;
        if (stringWord[0]>='a' && stringWord[0]<='z' ){
            flag = 1 ;
        }else if (stringWord[0]>='A' && stringWord[0]<='Z'){
            flag = 2;
        }
        switch (flag){
            case 1:
                for (int i = 1; i <stringWord.length ; i++) {
                    if (stringWord[i]>='A' && stringWord[i]<='Z'){
                        return false;
                    }
                }
                return true;
            case 2:
                for (int i = 1; i <stringWord.length ; i++) {
                    if (stringWord[i]>='A' && stringWord[i]<='Z'){
                        j++;
                    }
                    if (stringWord[i]>='a' && stringWord[i]<='z'){
                        j--;
                    }
                }
                if (Math.abs(j) == stringWord.length -1){
                    return true;
                }else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("string"));
    }
}
