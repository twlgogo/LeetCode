
/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 11:22
 */
public class NumberofSegmentsinaString {
    public static int countSegments(String s) {
        if (s==null||s.length()==0)return 0;
        int count = 0,flag = 1;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!=' '&&flag==1){count++;flag=0;}
            if (s.charAt(i)==' ')flag = 1;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }

}
