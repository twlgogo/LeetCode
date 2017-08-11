import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/10
 * Time: 14:14
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null)return result;
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if (curr.left!=null)queue.offer(curr.left);
                if (curr.right!=null)queue.offer(curr.right);
            }
            stack.add(list);
        }
        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}
