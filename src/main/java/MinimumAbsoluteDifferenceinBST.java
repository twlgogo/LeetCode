
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/4
 * Time: 18:09
 */
public class MinimumAbsoluteDifferenceinBST {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    ArrayList<Integer> list = new ArrayList<>();
    private void travelTree(TreeNode t){
        if (t == null)return;
        list.add(t.val);
        travelTree(t.left);
        travelTree(t.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if (root == null)return 0;
        travelTree(root);
        int[] val = new int[list.size()],result = new int[list.size()-1];
        for (int i = 0; i <val.length ; i++) {
            val[i] = list.get(i);
        }
        Arrays.sort(val);
        for (int i = 0; i <list.size()-1 ; i++) {
            result[i] = val[i+1] - val[i];
        }
        int res = result[0];
        for (int i = 0; i <result.length ; i++) {
           if (res>result[i])res = result[i];
        }
        return res;

    }
}
