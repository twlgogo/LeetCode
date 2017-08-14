/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/14
 * Time: 13:27
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]!=val)nums[index++] = nums[i];
        }
        return index;
    }
    public int removeElement2(int[] nums, int val) {
        int result = nums.length;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == val)result--;
        }
        return result;
    }
}
