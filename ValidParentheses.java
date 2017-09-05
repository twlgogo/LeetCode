import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/30
 * Time: 10:32
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s==null||s.length()==0)return true;
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            switch (c){
                case '(':stack.push(c);break;
                case  '[':stack.push(c);break;
                case  '{':stack.push(c);break;
                case  ')':{
                    if (stack.isEmpty()||stack.pop()!='(')
                        return false;
                    break;}
                case  '}':{
                    if (stack.isEmpty()||stack.pop()!='{')
                        return false;
                    break;}
                case  ']':{
                    if (stack.isEmpty()||stack.pop()!='[')
                        return false;
                    break;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("}"));
    }
}
