
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/9
 * Time: 11:24
 */
public class AddStrings {
    public static String addStringswrong(String num1, String num2) {
        if (num1 == null || num1.length()==0)return num2;
        if (num2 == null || num2.length()==0)return num1;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("0",0);map.put("1",1);map.put("2",2);map.put("3",3);
        map.put("4",4);map.put("5",5);map.put("6",6);map.put("7",7);
        map.put("8",8);map.put("9",9);
        Stack<String> num1Stack = new Stack<>();
        Stack<String> num2Stack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        for (int i = 0; i <num1.length() ; i++) {
            num1Stack.push(num1.charAt(i)+"");
        }
        for (int i = 0; i <num2.length() ; i++) {
            num2Stack.push(num2.charAt(i)+"");
        }
        int flag = 0;
        while(!num1Stack.isEmpty()||!num2Stack.isEmpty()){
            if (num1Stack.isEmpty()){
                while(!num2Stack.isEmpty())resStack.push(num2Stack.pop());break;
            }
            if (num2Stack.isEmpty()){
                while(!num1Stack.isEmpty())resStack.push(num1Stack.pop());break;
            }
            int a = map.get(num1Stack.pop());
            int b = map.get(num2Stack.pop());
            int sum = flag + a + b;
            if (sum >=10){
                sum -= 10;
                flag = 1;
            }else flag =0;
            resStack.push(sum+"");
        }
        //if (flag == 1)resStack.push(flag+"");
        String result="";
        while(!resStack.isEmpty())result += resStack.pop();
        return  result;
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length()-1 ,j = num2.length()-1; i >=0 || j>= 0||carry ==1  ; i--,j--) {

            int x = i<0? 0:num1.charAt(i)-'0';
            int y = j<0? 0:num2.charAt(j)-'0';
            int sum = x + y + carry;
            sb.append(sum%10);
            carry = (x+y+carry)/10;
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(addStrings("99","1"));
    }
}
