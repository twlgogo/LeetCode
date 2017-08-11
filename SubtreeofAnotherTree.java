import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 11:10
 */
public class SubtreeofAnotherTree {
    private boolean isSametree(TreeNode s, TreeNode t) {
        if (s == null && t == null)return true;
        else if (s == null)return false;
        else if (t == null)return false;
        boolean left = isSametree(s.left,t.left);
        boolean right = isSametree(s.right,t.right);
        return s.val==t.val&left&right;
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)return true;
        else if (s == null)return false;
        else if (t == null)return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(s);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if (isSametree(curr,t))return true;
            if (curr.left!=null)queue.offer(curr.left);
            if (curr.right!=null)queue.offer(curr.right);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
