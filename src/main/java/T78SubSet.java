
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/25
 * Time: 下午11:44
 */
public class T78SubSet {
  public static List<List<Integer>> subsets(int[] nums) {
    if (nums == null || nums.length == 0) return new ArrayList<>();
    List<List<Integer>> resList = new ArrayList<>();
    resList.add(new ArrayList<>());
    for (int i = 0; i < nums.length ; i++) {
      int length = resList.size();
      for (int j = 0; j <length ; j++) {
        List<Integer> list = new ArrayList<>(resList.get(j));
        list.add(nums[i]);
        resList.add(list);
      }
    }
    return resList;
  }

  public static void main(String[] args) {
    int []nums  = {1,2,3};
    List<List<Integer>> resList = subsets(nums);
    System.out.println(resList);
  }
}
