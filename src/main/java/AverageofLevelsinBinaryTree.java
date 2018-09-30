
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ttwl on 2017/7/13.
 */
public class AverageofLevelsinBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)return result;
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            double sum = 0.0;
            for (int i = 0; i <n ; i++) {
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;
                if (currentNode.left!=null)queue.offer(currentNode.left);
                if (currentNode.right!=null)queue.offer(currentNode.right);
            }
            result.add(sum/n);
        }
        return result;
    }



}
