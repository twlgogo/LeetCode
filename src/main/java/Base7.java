
import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/8
 * Time: 10:31
 */
public class Base7 {
    public static String convertToBase7(int num) {
        if (num == 0)return 0+"";
        Boolean flag = false;
        if (num<0){
            flag = true;
            num = -num;
        }
        String result = "";
        Stack<Integer> stack = new Stack<>();
        while (num/7 !=0){
            stack.add(num%7);
            num = num/7;
        }
        if (num != 0)stack.add(num);
        while(!stack.isEmpty()){
            result += stack.pop()+"";
        }
       return flag ? "-"+result:result;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(-100));
    }
}
