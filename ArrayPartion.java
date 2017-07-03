import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ttwl on 2017/7/2.
 */
public class ArrayPartion {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0;i<nums.length;i = i+2){
            result =result + nums[i];
        }
        return  result;
}


public static void main(String[] argus){
        int []nums = new int[10];
        for (int i = 0;i<10;i++){
            nums[i] =(int) (Math.random()*20);
        }
        for (int i = 0;i<10;i++){
           System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(ArrayPartion.arrayPairSum(nums));
}

}
