
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/6
 * Time: 10:45
 */
public class RelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {
        String[] result=new String[nums.length];
        int[] rawNums = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            rawNums[i] = nums[i];
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i <rawNums.length ; i++) {
            int rank = rawNums.length-list.indexOf(rawNums[i]);
            switch (rank){
                case 1:result[i] =  "Gold Medal";break;
                case 2:result[i] =  "Silver Medal";break;
                case 3:result[i] =  "Bronze Medal";break;
                default:result[i] = rank+"";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        String[] relativRanks = findRelativeRanks(nums);
        for (int i = 0; i <nums.length; i++) {
            System.out.println(relativRanks[i]);
        }

    }
}
