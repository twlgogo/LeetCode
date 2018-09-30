
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 10:42
 */
public class PascalsTriangleII {
//    public  List<Integer> getRow(int rowIndex) {
//        List<Integer> result = new LinkedList<>();
//        for (int i = 0; i <= rowIndex; i++) {
//            BigInteger temp = new BigInteger((factor(rowIndex)/(factor(i)*factor(rowIndex-i)))+"");
//            result.add(temp.intValue());
//        }
//        return result;
//    }
//    private long factor(int i ){
//        if (i == 0||i==1)return 1;
//        return factor(i-1)*i;
//    }
public List<Integer> getRow(int rowIndex) {
    List<Integer> list = new ArrayList<>();
    if (rowIndex < 0)return list;
    for (int i = 0; i <rowIndex+1 ; i++) {
        list.add(0,1);
        for (int j = 1; j <list.size()-1 ; j++) {
            list.set(j,list.get(j)+list.get(j+1));
        }
    }
    return list;
}

    public static void main(String[] args) {

        System.out.println(new PascalsTriangleII().getRow(21));
    }
}
