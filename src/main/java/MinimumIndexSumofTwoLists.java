
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/3
 * Time: 14:01
 */
public class MinimumIndexSumofTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> rawResult = new ArrayList<>();
        ArrayList<Integer> indexSum = new ArrayList<>();
        for (int i = 0; i <list1.length ; i++) {
            for (int j = 0; j <list2.length ; j++) {
                if (list1[i].equals(list2[j])){
                    rawResult.add(list1[i]);
                    indexSum.add(i+j);
                }
            }
        }
        int min = indexSum.get(0) ,n =0;  //找出最小的索引和，并记录个数
        for (int i = 0; i <indexSum.size() ; i++) {
            if (indexSum.get(i)<min){
                min = indexSum.get(i);
                n = 1;
            }
            if (indexSum.get(i) == min)n++;
        }
        String[] result = new String[n];
        int index =0;
        for (int i = 0; i <indexSum.size() ; i++) {
            if (indexSum.get(i) == min){
                result[index++]=rawResult.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] list1 = {""};
        String[] list2 = {""};
        String[] result = findRestaurant(list1,list2);
        System.out.println(Arrays.toString(result));
    }
}
