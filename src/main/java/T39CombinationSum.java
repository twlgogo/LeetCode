
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 3:59 PM
 */
public class T39CombinationSum {
  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> cur = new LinkedList<>();
    if (candidates == null || candidates.length == 0) return res;
    Arrays.sort(candidates);
    if (target < candidates[0]) {
      return res;
    }
    backTracing(res,cur,candidates,0,target);
    return res;
  }

  public static void backTracing(List<List<Integer>> res, List<Integer> cur, int[] candidates, int lastIndex, int resTarget) {
    if (resTarget == 0) {
      res.add(cur);
    }
    for (int i = lastIndex; i < candidates.length && resTarget >= candidates[i]; i++) {
      cur.add(candidates[i]);
      backTracing(res,new LinkedList<>(cur),candidates,i,resTarget - candidates[i]);
      cur.remove(cur.size() - 1);
    }
  }

  public static void main(String[] args) {
    int []nums = {2,3,6,7};
    System.out.println(combinationSum(nums,7));
  }
}
