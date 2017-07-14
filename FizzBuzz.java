import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttwl on 2017/7/11.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <=n ; i++) {
            if (i%3 == 0){
                if (i%5 == 0){
                    result.add("FizzBuzz");
                }else{
                    result.add("Fizz");
                }
            }else if (i%5 == 0){
                result.add("Buzz");
            }else {
                result.add(""+i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<String>();
        result = fizzBuzz(15);
        System.out.println(result);
    }
}


