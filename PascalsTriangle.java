import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/15
 * Time: 16:44
 *
 * 直接计算排列数非常可能产生越界，应注意尽量减小存储的数值
 */
public class PascalsTriangle {
   /* public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer> list = generateHelper(i);
            result.add(list);
        }
        return result;
    }
    private static List<Integer> generateHelper(int num){
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <=num ; i++) {
            long temp = factorial(num)/(factorial(i)*factorial(num-i));
            list.add((int)temp);
        }
        return list;
    }
    private static long factorial(int n){
        if (n==1||n==0)return 1;
        else return n*factorial(n-1);
    }*/

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)return result;
        for (int i = 0; i <numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <i+1 ; j++) {
                if (j==0||j==i)row.add(1);
                else row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
       /*System.out.println(factorial(3));
        System.out.println(generateHelper(13));
        System.out.println(factorial(13)/(factorial(1)*factorial(12)));
        System.out.println(factorial(13));*/
    }
}
