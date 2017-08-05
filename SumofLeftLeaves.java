import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/5
 * Time: 21:33
 */
public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null || root.left==null && root.right == null)return 0;
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentTreeNode = queue.poll();
            if (currentTreeNode.left != null && currentTreeNode.left.left == null && currentTreeNode.left.right ==null)
                result += currentTreeNode.left.val;
            if (currentTreeNode.left != null)queue.offer(currentTreeNode.left);
            if (currentTreeNode.right != null)queue.offer(currentTreeNode.right);
        }
        return result;
    }
}
