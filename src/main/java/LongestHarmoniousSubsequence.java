
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 10:06
 */
public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        if (nums == null || nums.length == 0)return 0;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] key = new int[map.keySet().size()];
        Iterator<Integer> iterator = map.keySet().iterator();
        int index = 0;
        while(iterator.hasNext()){
            key[index++] = iterator.next();
        }
        Arrays.sort(key);
        for (int i = 0; i <key.length-1 ; i++) {
            if (key[i+1] - key[i] ==1)
                result = Math.max(result,map.get(key[i])+map.get(key[i+1]));
        }
        //System.out.println(Arrays.toString(key));
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
