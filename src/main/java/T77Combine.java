
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/9/28
 * Time: 4:50 PM
 */
public class T77Combine {
  public static List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res = new LinkedList<>();
    if (k > n) return res;
    dfs(res,new LinkedList<>(),1, n, k);
    return res;
  }

  private static void dfs(List<List<Integer>> res, List<Integer> cur, int start, int n, int k) {
    if (cur.size() == k) {
      res.add(cur);
      return;
    }
    for (int i = start ; i <= n; i++) {
      cur.add(i);
      dfs(res,new LinkedList<>(cur),i + 1, n, k);
      cur.remove(cur.size() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(combine(3,2));
  }
}
