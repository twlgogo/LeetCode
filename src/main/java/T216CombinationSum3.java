
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 9:38 PM
 */
public class T216CombinationSum3 {
  public static List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> resList = new LinkedList<>();
    if (n < 1) return resList;
    dfs(resList,new LinkedList<>(),1,0,n,k);
    return resList;
  }

  private static void dfs(List<List<Integer>> resList, List<Integer> cur,int start, int curSum, int n, int k) {
    if (cur.size() == k && curSum == n) {
      resList.add(cur);
      return;
    }
    for (int i = start; i <= 9; i++) {
      curSum += i;
      cur.add(i);
      dfs(resList, new LinkedList<>(cur), i + 1, curSum, n , k);
      cur.remove(cur.size() - 1);
      curSum -= i;
    }
  }

  public static void main(String[] args) {
    System.out.println(combinationSum3(3,7));
  }
}
