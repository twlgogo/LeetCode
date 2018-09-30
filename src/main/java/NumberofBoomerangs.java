
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/7
 * Time: 16:00
 */
public class NumberofBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int result =0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <points.length ; i++) {
            for (int j = 0; j <points.length ; j++) {
                if (i != j){
                    int currDis = computingDis(points[i],points[j]);
                    map.put(currDis,map.getOrDefault(currDis,0)+1);
                }
            }
            for (int value:map.values()) {
                result += value*(value-1);
            }
            map.clear();
        }
        return result;
    }
    private int computingDis(int[] i,int[] j){
        int a = i[0] - j[0];
        int b = i[1] - j[1];
        return a*a+b*b;
    }
}
