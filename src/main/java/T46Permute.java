
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/27
 * Time: 9:56 PM
 */
public class T46Permute {
  List<List<Integer>> resList = new ArrayList<>();
  public List<List<Integer>> permute(int[] nums) {
    if (nums == null || nums.length == 0)return resList;
    permuteCore(nums,0);
    return resList;
  }
  private void permuteCore(int[] nums,int start) {
    if (start == nums.length - 1) {
      List<Integer> tempList = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        tempList.add(nums[i]);
      }
      resList.add(tempList);
    } else {
      for (int i = start; i < nums.length ; i++) {
        swap(nums,start,i);
        permuteCore(nums,start+1);
        swap(nums,i,start);
      }
    }

  }

  private void swap(int []nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    T46Permute permute = new T46Permute();
    int[] nums = {1,2,3};
    List<List<Integer>> lists = permute.permute(nums);
    System.out.println(lists);
  }
}
