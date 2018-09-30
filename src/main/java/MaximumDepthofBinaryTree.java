
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int maxDepth(TreeNode root) {
        int result =0 ;
        if (root == null){return result;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int x = queue.size();
            for (int i = 0; i <x ; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null)queue.offer(tempNode.left);
                if (tempNode.right != null)queue.offer(tempNode.right);
            }
            result++;
        }
        return result;
    }
}
